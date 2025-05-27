package ro.ase.cts.models.flyweight;

import ro.ase.cts.interfaces.Emoji;

public class ConcreteEmoji implements Emoji {
    private final String symbol;

    public ConcreteEmoji(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Emoji: " + symbol + " at (" + x + ", " + y + ")");
    }
}
