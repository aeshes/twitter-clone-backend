package ru.twitter.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Twit {

    private Long id;

    private User user;

    private String content;

    private String image;

    private String video;

    private boolean isReply;

    private boolean isTwit;

    private LocalDateTime createdAt;
}
