import java.util.Scanner;
class Student{
private int roll;
private String name;
private String dept;
String display()
{
return roll+" "+name+" "+dept;
}
int getRoll()
{
return roll;
}
String getName()
{
return name;
}
String getDept()
{
return dept;
}
void setRoll(int roll)
{
this.roll=roll;
}
void setName(String name)
{
this.name=name;
}
void setDept(String dept)
{
this.dept=dept;
}
void setData(int roll,String name,String dept)
{
this.roll=roll;
this.name=name;
this.dept=dept;
}
}
public class Object2{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
Student st[]=new Student[3];
for(int i=0;i<3;i++){
System.out.println("Roll");
int roll  = s.nextInt();
s.nextLine();
System.out.println("Name");
String name = s.nextLine();
System.out.println("Dept");
String dept  = s.nextLine();
Student s1 = new Student();
s1.setData(roll,name,dept);
st[i]=s1;
}
for (int i=0;i<3;i++){
System.out.println(st[i].display());
}
}
}
