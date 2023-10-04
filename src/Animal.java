public class Animal {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize attributes
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to make a generic sound
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}