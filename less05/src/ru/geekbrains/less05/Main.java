package ru.geekbrains.less05;

/**
 * Created by N.Davydova on 11.01.2017.
 */
public class Main {
    public static void main(String [] args) {
        Employee [] persons = new Employee[5];
        persons[0] = new Employee("Mosby", "Teodor", "Eveline", "Architector", "tdoc@yahoo.com", "+12125012244", 2000, 35);
        persons[1] = new Employee("Erickson", "Marshall", "John", "Judge", "great_bar@yahpp.com", "+16462115820", 4000, 37);
        persons[2] = new Employee("Stinson", "Barney", "Jeffree", "Economist", "awesomebs@yahoo.com", "+12123197382", 3500, 43);
        persons[3] = new Employee("Sherbatsky", "Robin", "Junior", "Manager", "sherbatsky@yahoo.com", "+12123325489", 3000, 42);
        persons[4] = new Employee("Aldrin", "Lily", "Mary", "Coordinator", "lilysweet@yahoo.com", "+16462135467", 1500, 41);

        for(int i = 0; i < persons.length; i++){
            if(persons[i].getAge() > 40)
                System.out.println(persons[i].info());
        }
    }
}
