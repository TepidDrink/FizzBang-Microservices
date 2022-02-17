package com.personal.fizzbang.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class FizzBangController {

    private FizzBangService fizzBangService;

    @PostMapping("/fizzbang")
    @ResponseBody
    public FizzBangResponse processRequest(@RequestBody NumberRequest numberRequest) {
        return fizzBangService.fizzBangTheRequest(numberRequest);
    }
}
