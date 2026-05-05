import java.util.*;

public class run_stuff {

    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<student>();

        // Load data
        student student1 = new student("Alice", 101);
        student1.add(85);
        student1.add(90);
        student1.add(78);
        students.add(student1);

        student student2 = new student("Bob", 102);
        student2.add(92);
        student2.add(88);
        student2.add(95);
        students.add(student2);

        student student3 = new student("Charlie", 103);
        student3.add(70);
        student3.add(60);
        student3.add(65);
        students.add(student3);

        // DOING THE MATH AND PRINTING ALL AT ONCE
        System.out.println("Processing...");
        for(int i = 0; i < students.size(); i++) {
            student temp = students.get(i);
            double data = temp.get_val();
            String grade = "";
            if (data >= 90){
                grade = "A";
            }
            else if (data >= 80){
                grade = "B";
            }
            else if (data >= 70){
                grade = "C";
            }
            else if (data >= 60){
                grade = "D";
            }
            else{
                grade = "F";
            }

            System.out.println("ID: " + temp.id + " | Name: " + temp.name + " | Avg: " + data + " | Grade: " + grade);
        }

        // FINDING THE BEST STUDENT
        double maxScore = -1;
        String bestStudent = "";
        for (student x : students) {
            if (x.get_val() > maxScore) {
                maxScore = x.get_val();
                bestStudent = x.name;
            }
        }
        System.out.println("Top: " + bestStudent + " with " + maxScore);

        // FINDING FAILING STUDENTS
        System.out.println("Needs Help:");
        for(student z : students) {
            if(z.get_val() < 70) {
                System.out.println(z.name);
            }
        }
    }
};