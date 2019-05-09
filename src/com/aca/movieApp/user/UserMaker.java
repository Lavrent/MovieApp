package com.aca.movieApp.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMaker {
    private static Scanner in = new Scanner(System.in);
    private List<User> users = new ArrayList<>();

    public void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    public List<User> getRegisteredUsers() {
        for (int i = 0; i < 10; i++) {
            System.out.println("print username");
            String userName = in.nextLine();
            System.out.println("print password");
            String password = in.nextLine();
            registerUser(new User(userName, password));
        }
        return users;
    }

    public User registerUser(User user) {
        if (users.size() > 0) {
            for (User user1 : users) {
                if (!user.getUserName().equals(user1.getUserName()))
                    users.add(user);
                else
                    System.out.println("the username is busy");
            }
        } else
            users.add(user);

        return user;
    }


    public void loginUser(User user) {
        for (User user1 : users) {
            if (user.getUserName().equals(user1.getUserName())) {
                System.out.println("the user has logged in ");
                return;
            }
        }
        System.out.println("wrong userName");
    }



}
