public class Person {
    String Firstname;
    String Id;
    String Lastname;
    public Person(String id,String firtName, String lastName){
        this.Id=id;
        this.Firstname=firtName;
        this.Lastname=lastName;

    }

    public String getId() {
        return this.Id;
    }

    public String getFirstName(){
        return this.Firstname;
    }

    public String getLastname(){
        return this.Lastname;
    }

    public void setLastname(String lastname){
         this.Lastname=lastname;
    }






}
