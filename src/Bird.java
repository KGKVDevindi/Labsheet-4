public class Bird extends Animal {
    // Additional attribute
    private double wingSpan;

    // Constructor to initialize attributes in both Animal and Bird
    public Bird(String name, int age, double wingSpan) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.wingSpan = wingSpan;
    }

    // Getter and setter for wingSpan
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    // Method to override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound.");
    }
}