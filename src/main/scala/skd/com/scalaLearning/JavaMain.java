package skd.com.scalaLearning;

public class JavaMain {
    public static void main(String[] args) {
        String s = new String("XYZ");
        String s1 = new String("XYZ");

        Employee e = new Employee(1,"XYZ");
        Employee e1 = new Employee(1,"XYZ");

        System.out.println(e==e1);
        System.out.println(e.equals(e1));
    }
}

class Employee{
    int id;
    String name;
    long sal;

    Employee(int id1,String name1){
        id=id1;
        name= name1;
    }

}
