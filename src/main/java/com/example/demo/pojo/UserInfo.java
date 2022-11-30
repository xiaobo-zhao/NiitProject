package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private String udescribe;
    private String uidentify;
    private String usex;
    private String utype;
    private String uschool;
    private Integer uid;
}
