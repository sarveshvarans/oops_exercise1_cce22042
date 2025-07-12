import java.util.*;
public class allOperator {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
int classes_absent;
float attendance_percentage;

System.out.println("Enter your details:");
System.out.print("Name: ");
String student_name = obj.nextLine();

System.out.print("Roll Number: ");
int student_rollnum = obj.nextInt();

System.out.print("Enter the number of classes handled: ");
int classes_took = obj.nextInt();
System.out.print("Enter the number of classes attended: ");
int classes_present = obj.nextInt();
obj.nextLine();

classes_absent = classes_took - classes_present;
attendance_percentage = ((float) classes_present / classes_took) * 100;


System.out.print("What is the reason for absence (sports/sickness/none): ");
String reason = obj.nextLine();


System.out.println("\n--- Attendance Report ---");
System.out.println("Name: " + student_name);
System.out.println("Roll No: " + student_rollnum);
System.out.println("Classes Attended: " + classes_present);
System.out.println("Classes Absent: " + classes_absent);
System.out.println("Attendance Percentage: " + attendance_percentage + "%");


if ((reason.equalsIgnoreCase("sports") || reason.equalsIgnoreCase("sickness")) && attendance_percentage >= 60.0) {
System.out.println("Attendance is valid due to genuine reason.");
} else if (attendance_percentage >= 75.0) {
System.out.println("Attendance is sufficient. No issues.");
} else {
System.out.println("Low attendance. You may not be eligible.");
}
attendance_percentage += 5;
System.out.println("Final adjusted attendance after grace: " + attendance_percentage + "%");
obj.close();
}
}
