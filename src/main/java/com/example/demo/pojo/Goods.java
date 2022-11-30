package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.mapper
 * @Author: Insist On
 * @CreateTime: 2022-11-22  11:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Goods {
    private String eid;
    private String price;
    private String description;
    private String ename;
    private String ephone;
    private String image;
    private String type;
    private String isrelease;
    private String seller;
}
