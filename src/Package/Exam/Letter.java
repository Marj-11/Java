package Package.Exam;

public class Letter {

    private String address;
    private Boolean stamped;

    public Letter(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Boolean isStamped(){
        return stamped;
    }

    public void stamp(){
        stamped = true;
    }
}
