package lsp.before;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Swallow());
        birds.add(new Pingving());
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
