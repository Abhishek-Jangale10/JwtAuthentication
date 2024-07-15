package com.codemyth.JwtAuthentication.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtRequest {

    private  String username;
    private String password;
}
