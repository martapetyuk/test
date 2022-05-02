package testproject;

public class Employee {
    private String first_name;
    private String last_name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String first_name, String last_name, String position, String email, int phone, int salary, int age) {
this.first_name = first_name;
this.last_name = last_name;
this.position = position;
this.email = email;
this.phone = phone;
this.salary = salary;
this.age = age;
    }
    public void SetFirst_name(String first_name){
        this.first_name = first_name;
    }
    public String GetFirst_name(){
        return first_name;
    }
    public void SetLast_name(String last_name){
        this.last_name = last_name;
    }
    public String GetLast_name(){
        return last_name;
    }
    public void SetPosition(String position){
        this.position = position;
    }
    public String GetPosition(){
        return position;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public String GetEmail(){
        return email;
    }
    public void SetPhone(int phone){
        this.phone = phone;
    }
    public int GetPhone(){
        return phone;
    }
    public void SetSalary(int salary){
        this.salary = salary;
    }
    public int GetSalary(){
        return salary;
    }
    public void SetAge(int age){
       if (age >= 0){
           this.age = age;
       }else {
           System.out.println("Введен некорректный возраст");
       }
    }
    public int GetAge(){
        return age;
    }
    public String toString(){
        return "Name:  " + first_name + last_name + "Position: " + position + " E-mail:  " + email + " Phone: " + phone + " Salary: " + salary;
    }
    public static void main(String[] args){
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivan "," Ivanov ", " Manager ", " fsnjd@gmail.com ",  294992029 , 5000,  42 );
        emplArray[1] = new Employee("Petr ", " Petrov ", " Hr ", " fdkjfk2@gmail.com ",  4782748, 3300, 23 );
        emplArray[2] = new Employee("Kiril ", " Kirilov ", " Accountant ", " xnvnxbxnv@gmail.com ", 2323322, 4000, 43);
        emplArray[3] = new Employee("Marta ", "Piatsiuk ", "Frontend ", " wooweo@gmail.com ", 38939232, 5000, 40);
        emplArray[4] = new Employee("Alexa " , "Patuk ", " Manager ", "iwewoo@gmail.com ", 3288392, 5000, 49);
        for (Employee employee: emplArray){
            if (employee.GetAge()>=40){
                System.out.println(employee);
            }
        }
}
}


