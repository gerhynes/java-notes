package chapter10;

public class Apple extends Fruit{
    public Apple(){
        setCalories(90);
    }

    public void removeSeeds(){
        System.out.println("Coring the apple");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is being juiced!");
    }
}
