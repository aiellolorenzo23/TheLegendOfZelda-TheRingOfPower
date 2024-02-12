package legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world.entities;

import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.EntityType;

public class Creature extends Entity{
    public Room location;

    public Creature(EntityType type, String name, String description, Room location) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public Creature() {
    }

    public Room getLocation() {
        return location;
    }
}
