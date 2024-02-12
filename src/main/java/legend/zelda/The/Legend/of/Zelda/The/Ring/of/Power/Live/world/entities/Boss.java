package legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world.entities;

import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.EntityType;

public class Boss extends Monster{
    public Boss(String name, String description, Room location) {
        super(name, description, location);
        this.type = EntityType.GANON;
    }
}
