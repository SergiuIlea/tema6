package org.fasttrack.tema7;

public class Persoana {
    public String name;
    public int age;
    public boolean married;
    public Persoana(String nume, int varsta, boolean maritat){
        name = nume;
        age = varsta;
        married = maritat;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String isMaried(){
        if (married == true) {
            return "married";
        }
        else {
            return "not married";
        }
    }

    public String toSting(){
        return "My name is " + name + ", I am " + age + " and I am " + isMaried();
    }
}
