package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> thisList = new ArrayList<>();

    public Forum() {
        thisList.add(new ForumUser(1,"John Kowalski",'M', LocalDate.of(1990,10,5),100));
        thisList.add(new ForumUser(2,"Wayne Nowak",'M',LocalDate.of(2005,1,10),50));
        thisList.add(new ForumUser(3,"Marta Malinowska",'F',LocalDate.of(1990,9,16),0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(thisList);
    }

}
