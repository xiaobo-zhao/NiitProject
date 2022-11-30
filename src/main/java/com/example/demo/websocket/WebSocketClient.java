package com.example.demo.websocket;

import lombok.Data;

import javax.websocket.Session;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.websocket
 * @Author: Insist On
 * @CreateTime: 2022-11-24  19:41
 */
@Data
public class WebSocketClient {
    private Session session;
    private String url;
}
