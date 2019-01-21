package com.example.adminclient2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zhangbaowei
 * Create  on 2019/1/21 11:22.
 */
@RestController
public class mycontroller {


    @RequestMapping("/a/test")
    public String test() {
        return new Date().toString();
    }
}
