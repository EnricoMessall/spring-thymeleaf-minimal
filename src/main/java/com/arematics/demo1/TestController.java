package com.arematics.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@Slf4j
public class TestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayIndexPage(TestDto testDto) {
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String displayTestPage() {
        return "test";
    }

    @PostMapping( "/")
    public String test(TestDto testDto) {
        log.info(testDto.toString());
        return "redirect:/test";
    }
}
