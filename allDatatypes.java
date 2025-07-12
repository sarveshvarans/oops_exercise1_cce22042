import java.util.*;
public class allDatatypes{
public static void main(String[] args){
Scanner inp=new Scanner(System.in);
System.out.println("Enter the student details for scholarship");
System.out.print("Name: ");
String student_name=inp.nextLine();

System.out.print("Age: ");
int student_age=inp.nextInt();


int total,sch=0;
float avg;
double fee=300000,final_fee,sch_fee;

System.out.println("Enter your marks subject-wise");
System.out.print("Subj 1:");
int s1_mark=inp.nextInt();

System.out.print("Subj 2:");
int s2_mark=inp.nextInt();

System.out.print("Subj 3:");
int s3_mark=inp.nextInt();

System.out.print("Subj 4:");
int s4_mark=inp.nextInt();

System.out.print("Subj 5:");
int s5_mark=inp.nextInt();

total=(s1_mark+s2_mark+s3_mark+s4_mark+s5_mark);
avg=(float)total/5;

System.out.println("TOTAL: "+total);
System.out.println("AVERAGE: "+avg);

char grade;
if (avg >= 90) {
grade = 'A';
} else if (avg >= 80 && avg < 90) {
grade = 'B';
} else if (avg >= 70 && avg < 80) {
grade = 'C';
} else if (avg >= 55 && avg < 70) {
grade = 'D';
} else {
grade = 'F';
}

System.out.println("GRADE:"+grade);

switch(grade){
case 'A':
sch=100;
break;

case 'B':
sch=75;
break;

case 'C':
sch=50;
break;

case 'D':
sch=25;
break;

case 'F':
sch=0;
break;

default:
System.out.println("Invlaid entry");
}

System.out.println("Scholarship awarded is "+sch+" percent");

sch_fee=((double)sch/100)*fee;
final_fee=fee-sch_fee;

System.out.println("YOUR FINAL FEE AFTER THE SCHOLARSHIP IS:"+final_fee);
inp.close();
}
}















