package Lecture2_Encapsulation.salaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private double salary;

    private int age;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(double bonus){
        if (age < 30) {
            bonus = bonus / 2;
        }
        salary = salary * (1 + (bonus / 100));
    }
    @Override
    public String toString() {
        return String.format("%s %s gets %f leva.", firstName, lastName, salary);
    }
}