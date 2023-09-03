package org.fasttrack.tema17;

public class PersonWithSplitNames {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public PersonWithSplitNames(String firstName, String secondName, int age, String city) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.lastName = secondName;
    }

    @Override
    public String toString() {
        return "PersonWithSplitNames{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
