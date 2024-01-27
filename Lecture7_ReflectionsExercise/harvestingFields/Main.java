package Lecture7_ReflectionsExercise.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
		Field[] declaredFields = richSoilLandClass.getDeclaredFields();
		Consumer<Field> printField = field -> System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
				field.getType().getSimpleName(), field.getName());

		String line = scanner.nextLine();

		while (!line.equals("HARVEST")) {
			switch (line) {
				case "private":
					Arrays.stream(declaredFields)
							.filter(field -> Modifier.isPrivate(field.getModifiers()))
							.forEach(printField);
					break;
				case "protected":
					Arrays.stream(declaredFields)
							.filter(field -> Modifier.isProtected(field.getModifiers()))
							.forEach(printField);
					break;
				case "public":
					Arrays.stream(declaredFields)
							.filter(field -> Modifier.isPublic(field.getModifiers()))
							.forEach(printField);
					break;
				case "all":
					Arrays.stream(declaredFields).forEach(printField);
					break;
			}
			line = scanner.nextLine();
		}
	}
}