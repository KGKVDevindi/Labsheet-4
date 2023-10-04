public class Main {
    public static void main(String[] args) {
        // Create instances of Animal, Mammal, Bird, and Dog
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Mammal lion = new Mammal("Lion", 10, "Golden");
        Bird eagle = new Bird("Eagle", 3, 2.5);
        Dog goldenRetriever = new Dog("Buddy", 4, "Golden", "Golden Retriever");

        // Call makeSound() method on each instance
        genericAnimal.makeSound();
        lion.makeSound();
        eagle.makeSound();
        goldenRetriever.makeSound();

        // Display information about each animal's attributes using toString()
        System.out.println("Generic Animal: " + genericAnimal.toString());
        System.out.println("Lion: " + lion.toString());
        System.out.println("Eagle: " + eagle.toString());
        System.out.println("Golden Retriever: " + goldenRetriever.toString());
    }
}
