package com.aca.movieApp.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMaker {
    private static Scanner in = new Scanner(System.in);

    public void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    public List<User> getRegisteredUsers() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("input username");
            String userName = in.nextLine();
            System.out.println("input password");
            String password = in.nextLine();
            if (users.isEmpty()) {
                users.add(new User(userName, password));
                continue;
            }
            User new_user = new User(userName, password);
            for (int j = 0; j < users.size(); j++) {
                if (new_user.getUserName().equals(users.get(j).getUserName())) {
                    System.out.println("the username is busy");
                    break;
                } else if (j == users.size() - 1) {
                    users.add(new_user);
                    break;
                }
                else
                    continue;
            }
        }
        return users;
    }

    public void loginUser(User user) {
        List<User> users = new ArrayList<>();
        for (User user1 : users) {
            if (user.getUserName().equals(user1.getUserName())) {
                System.out.println("the user has logged in ");
                return;
            }
        }
        System.out.println("wrong userName");
    }


}
