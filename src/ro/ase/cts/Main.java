package ro.ase.cts;

import ro.ase.cts.interfaces.Emoji;
import ro.ase.cts.interfaces.Tab;
import ro.ase.cts.models.decorator.AdBlockTab;
import ro.ase.cts.models.decorator.BasicTab;
import ro.ase.cts.models.decorator.PhishingFilterTab;
import ro.ase.cts.models.decorator.SessionRestoreTab;
import ro.ase.cts.models.flyweight.EmojiFactory;

public class Main {
    public static void main(String[] args) {
        Emoji emoji1 = EmojiFactory.getEmoji("😂");
        Emoji emoji2 = EmojiFactory.getEmoji("😂");
        Emoji emoji3 = EmojiFactory.getEmoji("🤦");

        emoji1.display(10, 20);
        emoji2.display(30, 40);
        emoji3.display(50, 60);

        System.out.println(emoji1 == emoji2);

        System.out.println("\n=== DECORATOR: Dynamic Tab Features ===");
        Tab simpleTab = new BasicTab();
        simpleTab.display();

        System.out.println("\nPremium tab with features:");
        Tab premiumTab = new PhishingFilterTab(
                new AdBlockTab(
                        new SessionRestoreTab(
                                new BasicTab()
                        )));
        premiumTab.display();
    }
}
