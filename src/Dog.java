public class Dog extends Mammal {
    // Additional attribute
    private String breed;

    // Constructor to initialize attributes in Animal, Mammal, and Dog
    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor); // Call the constructor of the superclass (Mammal)
        this.breed = breed;
    }

    // Getter and setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog makes a dog-specific sound.");
    }
}
