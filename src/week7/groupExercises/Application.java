package week7.groupExercises;

public class Application {

    public static void main(String[] args) {

        Person person = new Person();

        String firstName = person.getFirstName("Alex");
        String lastName = person.getLastName("Bertha");
        Integer age = person.getAge(19);
        String hobby = person.getHobby("eat");

        System.out.println(firstName + " " + lastName + " is " + age + " and he likes to " + hobby);
    }
}
