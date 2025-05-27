package ro.ase.cts.models.decorator;

import ro.ase.cts.interfaces.Tab;

public class BasicTab implements Tab {
    @Override
    public void display() {
        System.out.println("Displaying basic tab.");
    }
}
