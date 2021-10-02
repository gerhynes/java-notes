package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args){
        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        // iterator
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // enhanced for loop
        for(String item: fruit) {
            System.out.println(item);
        }

        // lambda
        fruit.forEach(x -> System.out.println(x));

        // lambda shorthand
        fruit.forEach(System.out::println);
    }

    public static void mapDemo(){

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);
    }

}
