package lsp.after;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Swallow());
        birds.add(new Pingwing());
        for (Bird bird : birds) {
            //bird.fly(); //The Bird class does not have a fly method.
        }

        ArrayList<FlyBehavior> flyingAnimals = new ArrayList<>();
        flyingAnimals.add(new Swallow());
        //flyingAnimals.add(new Pingwing()); //The Pingwing class does not implement the FlyBehavior interface, so it cannot be added to the ArrayList
        for (FlyBehavior flyingAnimal : flyingAnimals) {
            flyingAnimal.fly();
        }
    }
}
