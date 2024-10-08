package org.example;

public class Main {
    public static void main(String[] args) {
//        first();
//        second();
//        third();
        fourth();
    }
    public static void first() {
        String s1 = "Hello!!";
        String s2 = "Goodbye!!";
        String s3 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
    public static void second() {
        String s1 = new String("Hello!!");
        String s2 = new String("Hello!!");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
    public static void third() {
        String s1 = "Hello!!";
        String s2 = "Hello!!";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
    public static void fourth() {
        String s1 = "Hello!!";
        String s2 = null;
        if(s1 != null && s1.length() > 0)
            System.out.println(s1); //Code runs
        if(s2 != null && s2.length() > 0)
            System.out.println(s1.equals(s2)); //Code does not run
    }
}