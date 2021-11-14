public class Main {
    public static void main(String[] args) {
        person p = new person("Kinara", "Chapaneri", "India", 25);

        System.out.println("Old Address is: " + p.getAddress());
        System.out.println("Changed Address is: " + p.changeAddress("Canada"));
        System.out.println("Full Name: " + p.getfullName());
    }
    }

