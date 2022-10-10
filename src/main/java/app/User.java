package app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private int age;
    private int points;

    public User(String username, int age, int points) {
        this.username = username;
        this.age = age;
        this.points = points;
    }
}