package chapter10;

public class Banana extends Fruit{

    public Banana(){
        setCalories(100);
    }

    public void peel(){
        System.out.println("Peeling the banana");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is being juiced! (You weirdo)");
    }
}
