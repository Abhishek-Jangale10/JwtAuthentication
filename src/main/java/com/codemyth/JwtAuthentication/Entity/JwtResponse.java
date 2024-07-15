package com.codemyth.JwtAuthentication.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {
    private String username;
    private String jwtToken;
}
