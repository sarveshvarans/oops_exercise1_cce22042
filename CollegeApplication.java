import java.util.*;

public class CollegeApplication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] departments = {"CSE", "ECE", "MECH", "CIVIL"};
System.out.println("Welcome to College Admission Portal");

int totalStudents;
System.out.print("Enter number of students to apply: ");
totalStudents = sc.nextInt();
sc.nextLine();

int i = 0;
while (i < totalStudents) {
System.out.println("\nEnter details for student " + (i + 1));
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("Age: ");
int age = sc.nextInt();

if (age <= 16) {
System.out.println("Ineligible: Age must be strictly above 16.");
sc.nextLine();
i++;
continue;
}

System.out.print("Mark Percentage: ");
float marks = sc.nextFloat();
sc.nextLine();

if (marks < 35) {
System.out.println("Sorry, you are not eligible due to low marks.");
i++;
continue;
}

String selectedDepartment = "";
if (marks >= 90) {
selectedDepartment = "CSE";
} else if (marks >= 80) {
selectedDepartment = "ECE";
} else if (marks >= 70) {
selectedDepartment = "MECH";
} else {
selectedDepartment = "CIVIL";
}

if (marks >= 60) {
System.out.print("Would you like to choose your own department? (yes/no): ");
String choicePref = sc.nextLine();
if (choicePref.equalsIgnoreCase("yes")) {
System.out.println("Available Departments:");
for (int j = 0; j < departments.length; j++) {
System.out.println((j + 1) + ". " + departments[j]);
}
int choice;
do {
System.out.print("Enter your department choice (1-" + departments.length + "): ");
choice = sc.nextInt();
if (choice < 1 || choice > departments.length) {
System.out.println("Invalid choice. Try again.");
}
} while (choice < 1 || choice > departments.length);
sc.nextLine();
selectedDepartment = departments[choice - 1];
}
}

System.out.println("Congratulations " + name + ", you are selected for " + selectedDepartment);

System.out.print("Do you want to continue to the next student (yes/no): ");
String confirm = sc.nextLine();
if (confirm.equalsIgnoreCase("no")) {
System.out.println("Exiting");
break;
}
i++;
}

sc.close();
}
}
