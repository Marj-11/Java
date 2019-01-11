package week7.groupExercises;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String hobby;

    public String getFirstName(String firstName) {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public Integer getAge(Integer age) {
        return age;
    }

    public String getHobby(String hobby) {
        return hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
