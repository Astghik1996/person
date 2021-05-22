package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String passportId;
    private String nationality;
    private String sex;

    public Person(String firstName, String lastName, int age, String passportId, String nationality, String sex) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPassportId(passportId);
        setNationality(nationality);
        setSex(sex);
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        } else {
            System.out.println("First name must be in range 3 to 15");
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            System.out.println("Last name must be in range 6 to 20");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99) {
            this.age = age;
        } else {
            System.out.println("age must be in range 18 to 99");
        }

    }

    public void setPassportId(String passportId) {
        if (passportId.charAt(0) =='A' && passportId.charAt(1) == 'N' && passportId.length() == 8){
            for (int i = 2; i < passportId.length(); i++) {
                if (Character.isDigit(passportId.charAt(i))){
                    this.passportId = passportId;
                }
            }
        } else {
            System.out.println("Your passport Id is invalid");
        }

    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setSex(String sex) {
        String female = "female";
        String male = "male";
        if (sex.equalsIgnoreCase(female) ) {
            this.sex = female;
        }else if (sex.equalsIgnoreCase(male)){
            this.sex = male;
        }
        else {
            System.out.println(" invalid sex");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", passportId='" + passportId + '\'' +
                ", nationality='" + nationality + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}



