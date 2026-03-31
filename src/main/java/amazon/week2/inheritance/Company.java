package amazon.week2.inheritance;

import java.util.ArrayList;

public class Company {

    ArrayList<Staff> employees;


    static void main(String[] args) {
        Company amazon = new Company();
        amazon.employees = new ArrayList<>();

        amazon.employees.add(new Staff("Tuba", "Uzun", "tubauzun"));
        amazon.employees.add(new Staff("Ömer", "Kaya", "kayaoeme"));
        amazon.employees.add(new Head("Hyewon", "Yoo", "hyewony"));
        amazon.employees.add(new Director("Carmelo", "De Arriba", "cardearr"));



        amazon.employees.forEach(System.out::println);

        amazon.employees.getLast();
        /*
        for (int i = 0; i < amazon.employees.size(); i++) {

            System.out.println(amazon.employees.get(i));

        }

        */


    }


}
