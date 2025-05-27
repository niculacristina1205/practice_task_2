package ro.ase.cts.models.decorator;

import ro.ase.cts.interfaces.Tab;

public class AdBlockTab extends TabDecorator{
    public AdBlockTab(Tab decoratedTab) {
        super(decoratedTab);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Blocking ads.");
    }
}
