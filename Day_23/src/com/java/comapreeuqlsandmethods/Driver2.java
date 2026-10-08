package com.java.comapreeuqlsandmethods;

import java.util.Objects;

class Userme {

    String name;

    Userme(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Userme)) {
            return false;
        }

        Userme other = (Userme) obj;

        return Objects.equals(this.name, other.name);
    }
}

public class Driver2 {

    public static void main(String[] args) {

    	Userme user1 = new Userme("Java");
    	Userme user2 = new Userme("Java");

        System.out.println(user1.equals(user2));
    }
}