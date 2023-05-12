package com.portfolio.Database.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
