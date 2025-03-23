package Weekly3;

public class PersonalContact extends Contact{
    String relationship;

    public PersonalContact(String name, String phoneNumber, String realationship) {
        super(name, phoneNumber);
        this.relationship = realationship;
    }

    @Override
    public String toString(){
        return super.toString() + ", 관계: " + relationship;
    }
}
