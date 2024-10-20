package lsp.after;

public class Swallow extends Bird implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Svaler er elegante flyver");
    }
}
