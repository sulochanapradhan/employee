public class Employee {
    String name;
    String location;
    int age;
    double salary;

    public Employee(String name, String location, int age, double salary) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.salary = salary;
    }
    void raiseSalary(){
       this.salary= this.salary*1.2;
    }
}
