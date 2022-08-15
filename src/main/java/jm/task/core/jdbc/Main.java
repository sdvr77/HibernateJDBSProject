package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 18);
        userService.saveUser("Petr", "Petrov", (byte) 19);
        userService.saveUser("Sidr", "Sidorov", (byte) 20);
        userService.saveUser("Semen", "Semenov", (byte) 21);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
