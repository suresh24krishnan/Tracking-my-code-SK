// Dog inherits from Animal and is also a Pet
public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);   // this calls the constructor from animal and passes name
    }

    // this is polymorphism, we are overriding makeSound so it works uniquely for Dog objects
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    // this makes our Dog a Pet
    @Override
    public void play() {
        System.out.println("Playing fetch");
    }
}











