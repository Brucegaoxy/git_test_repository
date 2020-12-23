package com.example.webtest.test;

import lombok.Data;

/**
 * Description: http消息实体(发送地址：http://104.17.17.20:9988/pstore/service/idcard/pushmessage)
 * History：
 * ========================================
 * Date                Version     Memo
 * 2020/9/7 16:35       1.0       Created by gaoxy
 * ========================================
 * Copyright 2010-2020, 迪爱斯通信设备有限公司保留。
 */
@Data
public class HttpMsgVo {

    // 内容，json格式的业务推送数据
    private String content;
    // 消息来自
    private String from;
    // 业务系统消息主键，作为查询消息状态的依据 最多64位
    private String oid;
    // 应用包名
    private String pkgname;
    // 消息接收对象
    private String xxto;
    // 消息接收对象类型1、xxto填身份证，2、xxto填部门不包含子部门，3、xxto填部门并且包含子部门
    private int xxtype;

    @Data
    public class Content {

        // 应用名称
        private String appname;
        // 消息内容
        private String content;
        // 消息主键id
        private String destid;
        // 冗余字段
        private String extra;
        // 消息来源
        private String fromuser;
        // 消息时间
        private String time;
        // 消息标题
        private String title;
        // 消息类型1：预警；2：待办；3：通知；4：协同请求；5：其他
        private int type;
    }
}
