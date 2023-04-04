package Modifier.pers0n;

import Modifier.Person;

public class author {

    public static void main(String[] args) {
    }

    Person p = new Person();

    public author() {
        // akan terjadi error di sini karena atribut name
        // telah diberikan modifier protected
        p.name = "Petani Indomaret";
    }
}
