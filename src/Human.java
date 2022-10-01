public class Human {
    private Sex sex;
    private String firstName;
    private String secondName;

    Human(String firstName, String secondName, Sex sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Sex getSex() {
        return sex;
    }
}
