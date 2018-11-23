package javaTraits.ex2;



public class TemplateChooser {

    public String chooseTemplate(Customer customer){
        if (customer.getName().contains("Hokopoko")){
            return "privileged";
        }
        if(customer.getName().trim().startsWith("Mr.")){
            return "man";
        }
        if (customer.getName().trim().startsWith("Mrs.")||customer.getName().trim().startsWith("Ms.")){
            return "woman";
        }        return "default";
    }
}
