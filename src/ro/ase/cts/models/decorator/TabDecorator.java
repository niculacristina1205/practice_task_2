package ro.ase.cts.models.decorator;

import ro.ase.cts.interfaces.Tab;

public class TabDecorator implements Tab {
    protected Tab decoratedTab;

    public TabDecorator(Tab decoratedTab) {
        this.decoratedTab = decoratedTab;
    }

    @Override
    public void display() {
        decoratedTab.display();
    }
}
