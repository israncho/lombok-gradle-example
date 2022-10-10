package app;

public class Main {
    public static void main(String[] args) {
        User newUser = new User("israncho", 20, 1000);
        System.out.println("username: " + newUser.getUsername()); // using the get method without writing it
        System.out.println("user age: " + newUser.getAge()); 
        System.out.println("user points: " + newUser.getPoints()); 

        newUser.setUsername("isranchis");
        newUser.setAge(21);
        newUser.setPoints(500);
        System.out.println("\n\n--------------\n\n");
        System.out.println("username: " + newUser.getUsername()); // using the get method without writing it
        System.out.println("user age: " + newUser.getAge()); 
        System.out.println("user points: " + newUser.getPoints()); 
    }
}
