package ro.ase.cts;

import ro.ase.cts.interfaces.Emoji;
import ro.ase.cts.models.flyweight.EmojiFactory;

public class Main {
    public static void main(String[] args) {
        Emoji emoji1 = EmojiFactory.getEmoji("😂");
        Emoji emoji2 = EmojiFactory.getEmoji("😂");
        Emoji emoji3 = EmojiFactory.getEmoji("🤦");

        emoji1.display(10, 20);
        emoji2.display(30, 40);
        emoji3.display(50, 60);

        // emoji1 și emoji2 sunt aceeași instanță
        System.out.println(emoji1 == emoji2);
    }
}
