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

        Park park =new Park("Парк1", "Кирова", 1);
        Park.Attraction attraction1 = new Park.Attraction(1,"Аттракцион1", "11:00-16:00",10);
        park.addAttraction(attraction1);
        Park.Attraction attraction2 = new Park.Attraction(2,"Аттракцион2", "10:00-17:00",20);
        park.addAttraction(attraction2);
        Park.Attraction attraction3 = new Park.Attraction(3,"Аттракцион3", "14:00-18:00",30);
        park.deleteAttraction(attraction3);
        park.getInfoAttractions();

    }


}
