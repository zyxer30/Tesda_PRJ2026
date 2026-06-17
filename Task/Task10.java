/***
 * Task10.java
 * 
 * Write the method printFullName of student which prints the full name of a student.
 * 
 * class Student {
 *    private String firstName;
 *    private String lastName;
 *    public Student(String firstName, String lastName) {
 *        this.firstName = firstName;
 *        this.lastName = lastName;
 *    }
 *     // Your code goes here
 *    }
 * 
 * public Tasksheet10 {
 *    public static void main(String[] args) { 
 *       Student[] student = new Student[] {
 *          new Student("Morgan", "Freeman"),
 *          new Student("Brad", "Pitt"),
 *          new Student("Kevin", "Spacey")
 *       };
 *       for (Student s : student) {
 *          s.printFullName();
 *       }
 *    }     
 * }
 */

public class Task10 {
    public static void main(String[] args) { 
        Student[] student = new Student[] {
           new Student("Morgan", "Freeman"),
           new Student("Brad", "Pitt"),
           new Student("Kevin", "Spacey")
        };
        for (Student s : student) {
            s.printFullName();
        }

        System.out.println();
    }
}
class Student {
     private String firstName;
     private String lastName;
     public Student(String firstName, String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
     }
         public void printFullName() {
         System.out.println(firstName + " " + lastName);
     }
}
