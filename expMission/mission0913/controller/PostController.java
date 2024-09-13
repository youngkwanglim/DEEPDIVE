package com.example.mywebservice.controller;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.service.PostService;
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
        return "list";
    }

    // 게시글 작성하기 : 작성폼
    // http://localhost:8080/posts/create
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("post", new PostDto());
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
        model.addAttribute("post", postDto);
        return "detail";
    }

    // 게시글 업데이트 : 업데이트폼
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        PostDto postDto = postService.getPostById(id).orElseThrow(() -> new RuntimeException("Post not found"));
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
