package ru.twitter.model;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String fullName;

    private String location;

    private String website;

    private String birthDate;

    private String email;

    private String password;

    private String mobile;

    private String image;

    private String backgroundImage;

    private String bio;
}
