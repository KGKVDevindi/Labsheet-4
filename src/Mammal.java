public class Mammal extends Animal {
    // Additional attribute
    private String furColor;

    // Constructor to initialize attributes in both Animal and Mammal
    public Mammal(String name, int age, String furColor) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.furColor = furColor;
    }

    // Getter and setter for furColor
    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound.");
    }
}

