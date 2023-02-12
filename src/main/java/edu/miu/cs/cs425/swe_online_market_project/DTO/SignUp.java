package edu.miu.cs.cs425.swe_online_market_project.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
public class SignUp {
    @NotEmpty
    @Size(min = 2)
    private String firstName;
    @NotEmpty
    @Size(min=2)
    private String lastName;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min=2)
    private String password;
    @NotEmpty
    @Size(min=2)
    private String role;
}

