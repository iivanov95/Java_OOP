package Lecture7_ReflectionsExercise.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        Class<BlackBoxInt> blackBoxClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = blackBoxClass.getDeclaredConstructor();

        constructor.setAccessible(true);
        BlackBoxInt blackBox = constructor.newInstance();

        String line = scanner.nextLine();

        while (!line.equals("END")) {
            String[] tokens = line.split("_");
            String commandName = tokens[0];
            int parameter = Integer.parseInt(tokens[1]);
            Method method = blackBoxClass.getDeclaredMethod(commandName, int.class);
            method.setAccessible(true);
            method.invoke(blackBox, parameter);
            Field innerValue = blackBoxClass.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.get(blackBox));
            line = scanner.nextLine();
        }
    }
}