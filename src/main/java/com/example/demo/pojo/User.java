package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.pojo
 * @Author: Insist On
 * @CreateTime: 2022-11-30  11:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private String uid;
    private String uname;
}
