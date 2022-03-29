package com.example.demo.Helloworld.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(value = {"password"})
@JsonFilter("UserInfoV2")
public class UserV2 extends User{
    private String grade;

}
