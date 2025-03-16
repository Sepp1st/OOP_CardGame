package card;

import java.util.HashMap;
import java.util.Map;

public class CardSkin {
    private String skinName;
    private Map<String, String> skinImages = new HashMap<>();
    

    public CardSkin(String skinName) {
        this.skinName = skinName;
        //this.image = loadAndResizeImage(getImagePath(getRank(), suit), 100, 150); // Resize to 100x150 pixels
    }

    public String getSkinName() {
        return skinName;
    }

    public String getImagePath(String rank, String suit) {
            return "resources/cards/" + skinName + "/" + rank + suit + ".png";
    }

    
    
}
