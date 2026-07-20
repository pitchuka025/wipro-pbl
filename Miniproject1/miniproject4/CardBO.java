import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CardBO {

    public Map<String, List<Card>> getCards(List<Card> cardList) {

        Map<String, List<Card>> map = new TreeMap<>();

        for (Card card : cardList) {
            if (!map.containsKey(card.getSymbol())) {
                map.put(card.getSymbol(), new ArrayList<>());
            }
            map.get(card.getSymbol()).add(card);
        }

        return map;
    }
}
