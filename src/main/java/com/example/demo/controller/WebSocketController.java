package com.example.demo.controller;


import com.example.demo.pojo.Info;
//import com.example.demo.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.controller
 * @Author: Insist On
 * @CreateTime: 2022-11-24  20:07
 */
@RestController
@CrossOrigin
public class WebSocketController {
    /*@Autowired
    private WebSocketService webSocketService;
    @RequestMapping("/res")
    public void sendCommunication(@RequestBody Info info) throws IOException {
        webSocketService.sendInfo(info.getMessage());
    }*/
}
