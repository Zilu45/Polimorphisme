package This_dan_Super;

//public class Employee extends Person {
//    
//    float salary = 4000f;
//    String name = "Dian";
//    int age = 23;
//      
//    public void showInfo(){
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + super.age);
//        System.out.println("Salary: $" + salary);
//    }
//}

public class Employee extends Person {

    public Employee() {
        // eksekusi konstruktor induk
        super();
        
        System.out.println("Ekekusi konstruktor Employee()");
    }
    
    public void info(){
        super.showMessage();
    }
}



