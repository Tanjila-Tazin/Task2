package tanjila;

public class Student {
    int id;
    String name;
    static String universityName;

    Student() //Default Constructor;
    {
        universityName = "Leading University";
    }

    Student(String name) //parameterize constructor
    {
        this.name = name;
        System.out.println("Student's Name: " +name);
    }

    Student(int id) //parameterize constructor
    {
        this.id = id;
        System.out.println("Student's ID: " +id);
    }

    void display()
    {
        System.out.println("University Name: "+universityName);
    }
}

/*
    Name: Tanjila Chowdhury.
    ID: 2012020079
    Section: B
    Email: cse_2012020079@lus.ac.bd
    Date: 08-08-2021
 */