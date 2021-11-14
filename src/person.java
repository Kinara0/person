public class person {
    //firstName,  lastName ,  address,  age
    //write methods in class
    // getFullName() , return Fullname
    //write a constructor to create Person
    //changeAddress(Sting address);
    //getAddress(); should return the address of Person
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public person(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getfullName(){
        String fullName;
        fullName = firstName + " " + lastName;
        return fullName;
    }

    public String getAddress(){
        return address;
    }

    public String changeAddress(String address){
        return address;
    }
}
