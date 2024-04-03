public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Должность: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Номер телефона: " + this.phone);
        System.out.println("ЗП: " + this.salary);
        System.out.println("Возраст: " + this.age);
    }


}
