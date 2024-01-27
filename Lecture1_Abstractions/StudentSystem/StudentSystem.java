package Lecture1_Abstractions.StudentSystem;

public class StudentSystem {
    private final StudentRepo studentsRepository;
    private boolean running;

    public boolean isRunning() {
        return running;
    }

    public StudentSystem() {

        this.studentsRepository = new StudentRepo();
        this.running = true;
    }

    public void parseCommand(String[] args) {
        String command = args[0];
        if (command.equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            Student student = new Student(name, age, grade);
            studentsRepository.create(student);
        } else if (command.equals("Show")) {
            String name = args[1];
            Student student = studentsRepository.get(name);
            if (student != null) {

                System.out.println(student);
            }
        } else {
            running = false;
        }
    }
}