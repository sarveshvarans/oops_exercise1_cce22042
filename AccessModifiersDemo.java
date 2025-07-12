
class Person {
public String name = "Sarvesh";
private int age = 20;
protected String city = "Chennai";
String college = "Amrita";

public void showPublic() {
System.out.println("Public Name: " + name);
}

private void showPrivate() {
System.out.println("Private Age: " + age);
}

protected void showProtected() {
System.out.println("Protected City: " + city);
}

void showDefault() {
System.out.println("Default College: " + college);
}

public void accessAll() {
showPrivate();
}
}

public class AccessModifiersDemo {
public static void main(String[] args) {
Person p = new Person();
p.showPublic();
p.showProtected();
p.showDefault();
p.accessAll();
}
}
