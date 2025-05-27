package ro.ase.cts.models.decorator;

import ro.ase.cts.interfaces.Tab;

public class SessionRestoreTab extends TabDecorator{
    public SessionRestoreTab(Tab decoratedTab) {
        super(decoratedTab);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Restoring previous session.");
    }
}
