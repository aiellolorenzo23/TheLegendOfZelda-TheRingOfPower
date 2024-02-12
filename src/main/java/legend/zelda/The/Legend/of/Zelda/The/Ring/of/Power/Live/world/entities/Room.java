package legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world.entities;

import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.EntityType;

public class Room extends Entity{
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.type = EntityType.ROOM;
    }


}
