package ru.twitter.domain;

import lombok.Data;

@Data
public class Like {
    private Long id;

    private User user;

    private Twit twit;
}
