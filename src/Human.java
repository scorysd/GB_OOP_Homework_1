public class Human {
    private String firstName;
    private String secondName;
    private int sex;
    Human (String firstName, String secondName, int sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
}
