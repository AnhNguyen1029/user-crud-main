package com.example.usercrud.user.userDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateDto {
    private String name;
    private String email;

    @Override
    public String toString() {
        return "CreateDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
