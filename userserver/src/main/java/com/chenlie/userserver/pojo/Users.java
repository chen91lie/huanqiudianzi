package com.chenlie.userserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private int uid;
    private String name;
    private String password;
    private String tel;
    private String username;

}
