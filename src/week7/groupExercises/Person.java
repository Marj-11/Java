package week7.groupExercises;

public class Random {

    private String firstName;
    private String lastName;
    private Integer age;
    private String hobby;

    public Random(String firstName, String lastName, Integer age, String hobby) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobby = hobby;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "Random{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
    
}
