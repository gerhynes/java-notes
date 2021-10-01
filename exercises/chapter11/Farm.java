package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal donald = new Duck();
        Duck daffy = new Duck();

        Animal napolean = new Pig();
        Pig snowball = new Pig();

        donald.makeSound();
        daffy.makeSound();
        napolean.makeSound();
        snowball.makeSound();
    }
}
