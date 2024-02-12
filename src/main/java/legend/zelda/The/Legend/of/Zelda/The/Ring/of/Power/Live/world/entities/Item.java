package legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world.entities;

import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.EntityType;
import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.ItemType;
import static legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.ItemType.COMMON;

public class Item extends Entity{
    private ItemType itemType;

    public Item(String name, String description, ItemType type) {
        this.itemType = type;
        this.name = name;
        this.description = description;
        this.type = EntityType.ITEM;
    }

    public Item(String name, String description) {
        this.itemType = COMMON;
        this.name = name;
        this.description = description;
        this.type = EntityType.ITEM;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
