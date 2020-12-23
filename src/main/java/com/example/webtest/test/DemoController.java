package com.example.webtest.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 * History：
 * ========================================
 * Date                Version     Memo
 * 2019/9/9 11:42       1.0       Created by gaoxy
 * ========================================
 * Copyright 2010-2020, 迪爱斯通信设备有限公司保留。
 */
@RestController
@RequestMapping("/pstore")
public class DemoController {

    @RequestMapping("/service/idcard/pushmessage")
    public String test(@RequestBody List<HttpMsgVo> msgVo) {

        System.out.println(msgVo);

        return "OK";
    }
}
