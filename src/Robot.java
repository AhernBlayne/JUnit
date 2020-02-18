public class Robot {

    private String name;
    private boolean working = false;
    private int age;




    public Robot(String name, int age) {
        setName(name);
        setAge(age);
    }
    private void setName (String name){
        if (name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }


    private void setAge(int age) {
        if (age <= 30) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();

        }

    }
    public double checkCost() {
        if (age <= 5) {
            return 10000.00;
        } else if (age <= 10) {
            return 7500.00;
        } else return 5000.00;
    }
    public void sendAgeMsg() throws IllegalArgumentException {
        try {
            if (age > 25) {
                throw new IllegalArgumentException("Age too old");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println( "Age ok");
    }

    public String checkage() {
        if (age <= 20){
            return "Age ok";
        }
        else {
            return "Too old";
        }
}}
