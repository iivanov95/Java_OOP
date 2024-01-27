package Lecture10_DesignPatterns;

public class Main {
    public static void main(String[] args) {
        //SINGLETON
        Database database = Database.getInstance();

        database.create("Pesho", 42);
        database.create("Ivan", 28);

        Database database1 = Database.getInstance();
        int age = database1.delete("Pesho");
        System.out.println(age);
//=================================================================================
        //BUILDER

        Address address = Address.builder()
                .withEmail("kdasdkas@asldkas.com")
                .withCountry("Bulgaria")
                .withStreet("Dondukov")
                .withCity("Varna")
                .build();

    }
}


