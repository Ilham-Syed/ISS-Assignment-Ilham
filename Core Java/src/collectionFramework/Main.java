package collectionFramework;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 1. List of primitives
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        Collections.sort(numbers);
        System.out.println("Sorted List of integers: " + numbers);

        // 2. List of custom objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Ravi"));
        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Ilham"));

        // Sorting using Comparable (by ID)
        Collections.sort(students);
        System.out.println("Students sorted by ID (Comparable): " + students);

        // Sorting using Comparator (by name)
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("Students sorted by Name (Comparator): " + students);

        // 3. Set of custom objects
        Set<Student> studentSet = new HashSet<>(students);
        System.out.println("Student Set: " + studentSet);

        // 4. Map with custom object as key and value
        Map<Student, Student> studentMap = new HashMap<>();
        for (Student s : students) {
            studentMap.put(s, s);
        }

        System.out.println("Student Map:");
        for (Student s : studentMap.keySet()) {
            System.out.println("Key: " + s + ", Value: " + studentMap.get(s));
        }
	}
}
