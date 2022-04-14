package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<String,ForumUser> theResultMapOfUsersSexM = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .collect(Collectors.toMap(ForumUser::getUsername, forumUser -> forumUser));

        System.out.println(theResultMapOfUsersSexM);

        Map<String,ForumUser> theResultMapOfUsersAbove20 = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getDate().getYear() < LocalDate.now().getYear() - 20)
                .collect(Collectors.toMap(ForumUser::getUsername, forumUser -> forumUser));

        System.out.println(theResultMapOfUsersAbove20);

        Map<String,ForumUser> theResultMapOfUsersPostsAbove1 = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUsername, forumUser -> forumUser));

        System.out.println(theResultMapOfUsersPostsAbove1);

        Map<Integer,ForumUser> theResultMapOfUsersIdUserAsKey = forum.getUserList().stream()
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        theResultMapOfUsersIdUserAsKey.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}