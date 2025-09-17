package ru.twitter.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private Long id;

    private String fullName;

    private String location;

    private String website;

    private LocalDateTime birthDate;

    private String email;

    private String password;

    private String mobile;

    private String image;

    private String backgroundImage;

    private String bio;
}
