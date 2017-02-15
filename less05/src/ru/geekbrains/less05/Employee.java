package ru.geekbrains.less05;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telNumber;
    private int salary;
    private int age;

    public Employee(String surname,
                    String name,
                    String patronymic,
                    String position,
                    String email,
                    String telNumber,
                    int salary,
                    int age){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public String info(){
        return surname + " " + name + " " + patronymic + " " + position + " " + email + " " + telNumber + " " + salary + " " + age;
    }

    public int getAge(){
            return this.age;
    }
}
