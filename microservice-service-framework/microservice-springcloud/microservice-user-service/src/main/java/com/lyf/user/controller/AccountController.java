package com.lyf.user.controller;

import com.lyf.common.resp.ResultResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyunfei
 **/
@RestController
@RequestMapping("/account")
public class AccountController {
    @PostMapping("/create")
    public ResultResp<Boolean> create() {
        return new ResultResp<>();
    }
}
