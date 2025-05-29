package collectionFramework;

public class Student implements Comparable<Student>{
	int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural order by ID
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    public String toString() {
        return id + " - " + name;
    }

    // Needed for Set and Map to detect duplicates
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return this.id == s.id && this.name.equals(s.name);
    }
}

