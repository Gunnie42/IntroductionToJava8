package firstproject;

/**
 * Created by Gunter on 1/04/2017.
 */
public class Person {


    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    // Variables
    private String firstName;
    private String lastName;
    private volatile int age; // volatile something to do with concurrencyJ
    private Person mother;

    // Setters

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void birthday(){
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mother=" + mother +
                '}';
    }
}
