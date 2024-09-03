package com.spring.mvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {

    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    // http://localhost:8080/requestMappingGetTest
    @RequestMapping(value = "/requestMappingGetTest", method = RequestMethod.GET)
    public String requestMappingGetTest(Model model){
        model.addAttribute("textFromController", "World");
        model.addAttribute("textFromController2", "JJJJJJJJ");
        return "requestHello";
    }

    // [오류] http://localhost:8080/requestParamTest
    // http://localhost:8080/requestParamTest?b=anystring
    // http://localhost:8080/requestParamTest?a=1&b=anystring&c=false
    @RequestMapping("/requestParamTest")
    public String requestParamTest(@RequestParam(name = "a", required = false, defaultValue = "0") int a,
                                   @RequestParam("b") String b,
                                   @RequestParam(name = "c", defaultValue = "true") boolean c)
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        return "hello";
    }

    // http://localhost:8080/requestParamMapTest?param1=1&param2=2
    @RequestMapping("/requestParamMapTest")
    public String requestParamMapTest(@RequestParam Map<String, String> map) {
        System.out.println("----");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        return "hello";
    }

    // [오류] http://localhost:8080/requestPathVariableTest
    // [오류] http://localhost:8080/requestPathVariableTest/spring/test/complete
    // http://localhost:8080/requestPathVariableTest/spring/test/2024
    @RequestMapping("/requestPathVariableTest/{a}/{b}/{c}")
    public String requestPathVariableTest(@PathVariable(value = "a") String a,
                                          @PathVariable String b,
                                          @PathVariable int c)
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        return "hello";
    }
}
