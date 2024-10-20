package lsp.before;

public class Pingving extends Bird{
    @Override
    public void fly() {
        throw new RuntimeException("Pingvings can't fly");
    }
}
