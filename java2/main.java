public class main {

    public static void main(String[] args) {
        Student stud = new Student(50, "pa", 2000, 0.02);
        stud.showDetails();
        stud.setID(500);
        stud.setName("paaa");
        stud.setAdmissionYear(2022);
        stud.setGPA(4.00);
        stud.showDetails();
    }
}

class Student {
      
    private int ID;
    private String name;
    private int admissionYear;
    private double GPA;

    public Student(int ID, String name, int admissionYear, double GPA) {
        this.ID = ID;
        this.name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdmissionYear(int admissionYear){
        this.admissionYear = admissionYear;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    
    public void showDetails() {
        System.out.println("Student ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }
}
