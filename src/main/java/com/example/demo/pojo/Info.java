package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.pojo
 * @Author: Insist On
 * @CreateTime: 2022-11-24  22:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Info {
    private String message;
}
