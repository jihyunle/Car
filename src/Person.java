/*
Create an abstract Person class.
Then extend that class to create a Driver, Pilot, Captain or whoever is operating the vehicles you created.
Add the person to your Car, Boat, etc...

Add a print statement that says the red porsche is being driven by Bob.
You will get Bob from the person.getName() method.
*/

public abstract class Person {
    private String name;
    private String occupation;
    private Job job;

    public Person(){
        job = new Job();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
