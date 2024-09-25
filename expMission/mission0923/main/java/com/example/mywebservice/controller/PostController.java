package com.spring.exp.mission0923.main.java.com.example.mywebservice.controller;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.entity.User;
import com.example.mywebservice.service.PostService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 게시슬 전체 보기
    // http://localhost:8080/posts
    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", postService.getAllPosts());

        // 현재 인증된 사용자의 정보를 가져오기
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = (User) userDetails;
        // 사용자 닉네임을 모델에 추가
        model.addAttribute("nickname", user.getNickname());
        return "list";
    }

    // 게시글 작성하기 : 작성폼
    // http://localhost:8080/posts/create
    @GetMapping("/create")
    public String createForm(Model model) {
        // 현재 인증된 사용자의 정보를 가져오기
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = (User) userDetails;

        PostDto postDto = new PostDto();
        postDto.setAuthor(user.getNickname()); // 작성자 필드에 닉네임 자동 설정
        model.addAttribute("post", postDto);
        return "create";
    }

    // 게시글 작성하기 : 게시글 등록
    @PostMapping("/create")
    public String createPost(@ModelAttribute("postDto") PostDto postDto) {
        postService.createPost(postDto);
        return "redirect:/posts";
    }

    // 게시글 상세 보기
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        PostDto postDto = postService.getPostById(id).orElseThrow(() -> new RuntimeException("Post not found"));

        // 현재 인증된 사용자의 정보를 가져오기
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = (User) userDetails;

        // 로그인한 사용자가 게시글 작성자인지 확인
        boolean isAuthor = postDto.getAuthor().equals(user.getNickname());

        // 모델에 게시글 정보와 isAuthor 값을 추가
        model.addAttribute("post", postDto);
        model.addAttribute("isAuthor", isAuthor);
        return "detail";
    }

    // 게시글 업데이트 : 업데이트폼
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        PostDto postDto = postService.getPostById(id).orElseThrow(() -> new RuntimeException("Post not found"));

        // 수정 폼에서도 작성자 필드를 수정할 수 없도록 하기 위해 readonly로 설정
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = (User) userDetails;
        postDto.setAuthor(user.getNickname()); // 작성자 필드에 닉네임 자동 설정

        model.addAttribute("post", postDto);
        return "edit";
    }

    // 게시글 업데이트 : 업데이트 정보 등록
    @PostMapping("/{id}/edit")
    public String editPost(@PathVariable Long id, @ModelAttribute("post") PostDto updatePostDto) {
        postService.updatePost(id, updatePostDto);
        return "redirect:/posts";
    }

    // 게시글 삭제
    @PostMapping("/{id}/delete")
    public String deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
}
