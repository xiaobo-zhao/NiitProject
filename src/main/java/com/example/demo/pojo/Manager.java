package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.pojo
 * @Author: Insist On
 * @CreateTime: 2022-11-07  11:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Manager {
    private String mid;
    private String musername;
    private String mpassword;
    private String memail;
}
