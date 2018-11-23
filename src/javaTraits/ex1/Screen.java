package javaTraits.ex1;


public class Screen {

    public void display(Customer customer){

        if(customer.getCategory().equals("Business")){
            System.out.println(customer.getName().toUpperCase());

        }else{
            System.out.println(customer.getName().toLowerCase());
        }

    }

}
