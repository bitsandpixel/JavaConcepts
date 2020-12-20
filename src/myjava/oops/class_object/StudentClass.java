package myjava.oops.class_object;

/**
 * Example of Class and Object
 *
 * @author Vishnu Kandanelly
 */
//TODO: check the clean code by baeldung to make changes as per the code cleaning strategies in java
public class StudentClass {
    private int Id;
    private String name;

    public StudentClass() {
    }

    public StudentClass(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StudentClass student1 = new StudentClass(001, "vishnu");
        StudentClass student2 = new StudentClass(002, "kiran");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
