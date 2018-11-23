package javaTraits.ex2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceApplication {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Mr. Rabie", "hfgh");
        Customer customer2 = new Customer(" Ms. Tamara", "princess");
        Customer customer3 = new Customer("Mrs. Leen Hokopoko", "sweet");
        Customer customer4 = new Customer("Jasem", "fuduf");

        List<Customer> customers = new ArrayList<>();
        customers.addAll(Arrays.asList(customer4, customer1, customer2, customer3));

        TemplateChooser templateChooser = new TemplateChooser();
        for (Customer customer : customers) {
            System.out.println(templateChooser.chooseTemplate(customer));
        }

    }
}