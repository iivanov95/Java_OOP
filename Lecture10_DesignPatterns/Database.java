package Lecture10_DesignPatterns;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Map<String, Integer> memory;

    private static Database instance;

    private Database() {
        // simulates heavy operation
        // like resource connections/acquisition
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        memory = new HashMap<>();
        System.out.println("Connection established!");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    //CRUD operations:
    //Create
    //Read
    //Update
    //Delete

    public void create(String key, int value) {
        memory.put(key, value);
    }

    public int read(String key) {
        return memory.get(key);
    }

    public void update(String key, int value) {
        create(key, value);
    }

    public int delete(String key) {
        return memory.remove(key);
    }
}
