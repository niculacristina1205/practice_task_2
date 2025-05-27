package ro.ase.cts.models.decorator;

import ro.ase.cts.interfaces.Tab;

public class PhishingFilterTab extends TabDecorator{
    public PhishingFilterTab(Tab decoratedTab) {
        super(decoratedTab);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Filtering phishing websites.");
    }
}
