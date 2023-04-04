package Konstruktor;

public class User {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class DemoConstructor {
    public static void main(String[] args) {
        User schyte = new User("Syarofi poke", "Janji gak retri");
        System.out.println("Username: " + schyte.username);
        System.out.println("Password: " + schyte.password);
    }
}
