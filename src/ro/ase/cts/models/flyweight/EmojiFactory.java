package ro.ase.cts.models.flyweight;

import ro.ase.cts.interfaces.Emoji;

import java.util.HashMap;
import java.util.Map;

public class EmojiFactory {
    private static final Map<String, Emoji> emojiMap = new HashMap<>();

    public static Emoji getEmoji(String symbol) {
        if (!emojiMap.containsKey(symbol)) {
            emojiMap.put(symbol, new ConcreteEmoji(symbol));
        }
        return emojiMap.get(symbol);
    }
}
