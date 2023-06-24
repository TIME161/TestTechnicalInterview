package org.example;

import org.example.model.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(17, "Name 1");
        User user2 = new User(75, "Name 2");
        User user3 = new User(12, "Name 3");
        User user5 = new User(12, "Name 3");
        User user4 = new User(25, "Name 4");
        Collection<User> user = new ArrayList<>(List.of(user1, user2, user3, user4, user5));

        System.out.println(getUniqeOldestUser(user).toString());

    }

    public static User getUniqeOldestUser(Collection<User> userToSort) {
        Set<User> uniqueUsers = new HashSet<>(userToSort);
        List<User> userList = new ArrayList<>(uniqueUsers);
        userList.sort(Comparator.comparing(User::getAge).reversed().thenComparing(User::getName));
        User oldesUser = userList.get(0);


        return oldesUser;
    }

}