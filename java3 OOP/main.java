class Main{
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 40, 123, 50000, "IT");

        Programmer programmer = new Programmer("Jane Smith", 30, 456, 400000, "Java");

        Security security = new Security("Adam Jones", 45, 789, 18000, "Night Shift");

        System.out.println("*********************************");
        manager.showdetails();
        manager.work();
        manager.CallMeeting();
        System.out.println("*********************************");
        programmer.showdetails();
        programmer.work();
        programmer.coding();
        System.out.println("*********************************");
        security.showdetails();
        security.work();
        security.Patrol();
        System.out.println("*********************************");
    }
}

class employee{
    String name;
    int age;
    int employeeID;
    int salary;

    employee(String name,int age,int employeeID,int salary){
        this.name = name;
        this.age = age;
        this.employeeID = employeeID;
        this.salary  = salary;
    }

}

class Manager extends employee{
    String department;

    Manager(String name,int age,int employeeID,int salary,String department) {
        super(name, age, employeeID, salary);
        this.department = department;
    }

     public void showdetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Employee ID: "+this.employeeID);
        System.out.println("Salary: "+this.salary);
        System.out.println("Department: "+this.department);
    }

    public void work(){
        System.out.println(this.name + " is working");
    }

    public void CallMeeting(){
        System.out.println(this.name + " is scheduling a meeting");
    }
}

class Programmer extends employee {
    String language;

    Programmer(String name,int age,int employeeID,int salary,String language){
        super(name,age,employeeID,salary);
        this.language = language;
    }

    public void showdetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Employee ID: "+this.employeeID);
        System.out.println("Salary: "+this.salary);
        System.out.println("Language: "+this.language);
    }

    public void work(){
    System.out.println(this.name + " is working");
    }

    public void coding(){
    System.out.println(this.name + " is coding");
    }
}

class Security extends employee {
    String Shift;

    Security(String name,int age,int employeeID,int salary,String Shift){
        super(name,age,employeeID,salary);
        this.Shift = Shift;
    }

    public void showdetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Employee ID: "+this.employeeID);
        System.out.println("Salary: "+this.salary);
        System.out.println("Avaliable at "+this.Shift);
    }

    public void work(){
    System.out.println(this.name + " is working");
    }

    public void Patrol(){
    System.out.println(this.name + " is Patrolling");
    }
}