package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int idUser;
    private final String username;
    private final char sex;
    private final LocalDate date;
    private final int posts;

    public ForumUser(final int idUser,final String username,final char sex,final LocalDate date,final int posts) {
        this.idUser = idUser;
        this.username = username;
        this.sex = sex;
        this.date = date;
        this.posts = posts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", posts=" + posts +
                '}';
    }
}
