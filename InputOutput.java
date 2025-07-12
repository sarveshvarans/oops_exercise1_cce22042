import java.util.*;
public class InputOutput{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Give your Name,Age,CGPA:");
String name=obj.nextLine();
int age=obj.nextInt();
float cgpa=obj.nextFloat();

System.out.println("Hi Mr."+name+" (aged"+age+") Your cgpa is "+cgpa);
obj.close();
}
}





