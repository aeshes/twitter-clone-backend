package ru.twitter.model;

import lombok.Data;

@Data
public class Like {
    private Long id;

    private User user;

    private Twit twit;
}
