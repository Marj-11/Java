package week7.reflection7;

import week4.ex9.FileReader;

public class EmployeeApplication {

    public static void main(String[] args) {

        Employee employee = new Employee();
        FileReader fileReader = new FileReader();
        employee.readDocument(fileReader);



    }

}
