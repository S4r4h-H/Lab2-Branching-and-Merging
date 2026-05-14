public class Polymorphism {
    // DONE TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
        // Using getter method ensures polymorphic behavior
        return p.getRole();
    }
}

class Person {
    private final String role = "General"; //switched this from public to private
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //also added this
    public String getRole() {
        return this.role;
    }

}

class Student extends Person {
    private final String role = "Student";  //changed from public to private
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
    //this was added too
    @Override
    public String getRole() {
        return this.role;
    }


}