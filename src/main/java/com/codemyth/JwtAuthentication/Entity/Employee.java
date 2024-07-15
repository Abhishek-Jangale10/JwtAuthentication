package com.codemyth.JwtAuthentication.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Employee {

    private String id;
    private String name;
    private String email;
}
