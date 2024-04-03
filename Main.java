import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Иванов Иван Иванович", "Директор", "dir@mail.ruf", "891567155564564", 888888, 33);
        employee.getEmployeeInfo();


        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Иванов Иван Иванович", "Директор", "fdjkhr@mail.ruf", "89156715564", 884358, 33);
        employeesArray[1] = new Employee("Петров Иван Иванович", "Начальник отдела сбыта", "kldjsf@mail.ruf", "89157676764564", 43984387, 32);
        employeesArray[2] = new Employee("Иванов Петр Иванович", "Начальник цеха", "lkijudsf@mail.ruf", "4359877155564564", 4376573, 43);
        employeesArray[3] = new Employee("Иванов Иван Сергеевич", "Бухгалтер", "kjhdsf@mail.ruf", "982379832743987", 378632, 46);
        employeesArray[4] = new Employee("Сидоров Иван Петрович", "Финансовый директор", "kujhsdf@mail.ruf", "32094498372", 328934784, 29);

    }


}
