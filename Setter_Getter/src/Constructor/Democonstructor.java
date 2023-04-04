package Constructor;

public class Democonstructor {
    public static void main(String[] args) {        
        user Kristus = new user("Fadhil", "MurahSenyum");

        Kristus.setUsername("Dika Kreestoast");
        Kristus.setPassword("Kwan Kwin Kwan");

        System.out.println("username: " + Kristus.username);
        System.out.println("password: " + Kristus.password);
    }
}
