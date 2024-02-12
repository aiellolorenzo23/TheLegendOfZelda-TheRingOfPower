package legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world;

import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.Direction;
import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.enums.ItemType;
import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world.entities.*;
import legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.world.globals.Globals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class World {
    //#DEFINE variables
    private static final String ACTION_INVENTORY = "inventory";

    private static final String ACTION_LOOK = "look";
    private static final String ACTION_SEE = "see";

    private static final String ACTION_GO = "go";
    private static final String ACTION_WALK = "walk";

    private static final String ACTION_TAKE = "take";
    private static final String ACTION_GRAB = "grab";

    private static final String ACTION_DROP = "drop";
    private static final String ACTION_LEAVE = "leave";

    private static final String ACTION_EQUIP = "equip";
    private static final String ACTION_ARM = "arm";

    private static final String ACTION_UNEQUIP = "unequip";
    private static final String ACTION_UNARM = "unarm";

    private static final String ACTION_ATTACK = "attack";
    private static final String ACTION_FIGHT = "fight";

    private static final String ACTION_LOCK = "lock";
    private static final String ACTION_CLOSE = "close";

    private static final String ACTION_UNLOCK = "unlock";
    private static final String ACTION_OPEN = "open";

    private static final String ACTION_LOOT = "loot";
    private static final String ACTION_STEAL = "steal";

    private static final String ACTION_TALK = "talk";
    private static final String ACTION_SPEAK = "speak";

    private static final String ACTION_ASK = "ask";

    private static final String ACTION_RIDDLE = "riddle";

    public static final String ACTION_EXIT = "exit";
    public static final String ACTION_QUIT = "quit";

    private static final String ACTION_HELP = "help";

    public TheHero player;
    public List<Entity> entities = new ArrayList<>();
    public boolean gameOver;

    public World() {

        //CREATE-MAP
        Room entrance = new Room("Entrance of the Tower of Evil", "There's a large door in the north: enter to fight for the fate of Hyrule.");
        Room atrium = new Room("Atrium of the Tower of Evil", "Evil's atmosphere out there. Malice sorrounds every corner. You can see a door to the east and stairs to the north.");
        Room room1 = new Room("Room 1", "Empty room sorrounded by ancient stuffs. You can see a door to the east.");
        Room room2 = new Room("Room 2", "There's a strange atmosphere in this room. You can see an artificial sky above, many dark red clouds up there. You can see a door to the east.");
        Room room3 = new Room("Room 3", "You are surrounded by strange pillars, malice all over the place. A chest in the middle of the pillars. A strange marker in the east, maybe you can throw something to it.");
        Room wizardPotionRoom = new Room("Wizard Potion Room", "Looks like an old library. Cruet and jars everywhere. In the chaos you can see bones, maybe belongs to Hyrulian warriors. In front of you, a man chained to the wall staring at you. Over a table you can see potions.");
        Room room4 = new Room("Room 4", "A long corridor of stairs. What's upstairs?");
        Room room5 = new Room("Room 5", "An empty room. In front of you a giant door but seems missing something to open. You can see a door to the east and another one to the west sorrounded by malice. You wonder how to get rid of that.");
        Room room6 = new Room("Room 6", "It's very dark you can't see anything. Smells like death corpse in here. Must be careful.");
        Room iceTemple = new Room("Trial room: Ice Temple", "Cold cold room. Seems a world of ice. A skeleton of a Zora warrior stares at you. He seems alive...behind him on the south, a waterfall that hide a room on the top of it.");
        Room lockedRoom = new Room("Waterfall", "A waterfall, in the castle. How can you go to the top?");
        Room windTemple = new Room("Trial room: Wind Temple", "A strong wind echoes in the air. A skeleton of a Rito is in the middle of the place. You can only go back");
        Room enemiesRoom1 = new Room("Enemies room 1", "You can hear strange sounds. Wait! A Moblin is coming to attack yoy, be careful!");
        Room room7 = new Room("Room 7", "It's very dark you can't see anything. You only can see a room to the east lighted trhough a fragile firetorch.");
        Room lavaRoom = new Room("Lava room", "It's hot very hot. Lava sorrounds everythings. Resembles the volcano of the Death Mountain. There are paths to north and south, be careful.");
        Room fireTemple = new Room("Trial room: Fire Temple", "The heath never stops. Flames burns everything. A skeleton of a Goron is in the middle of the place. You can only go back to south");
        Room earthTemple = new Room("Trial room: Earth Temple", "It's very calm here. No mor heath. Flags of the Yiga clan sorrounds the place. There's a skeleton of a sheika monk in the middle of the room. You can only go back to north.");
        Room room8 = new Room("Room 8", "Seems a library. You can see a book on the table. A door in the north.");
        Room room9 = new Room("Room 9", "Empty room. But wait, sands on the floor? You can see a door to the north.");
        Room lightingTemple = new Room("Trial room: Lighting Temple", "It's like Gerudo deserts. It disoriented you. A skeleton of a Gerudo warrior is in the middle of the place. You can go back to south and go to west.");
        Room room10 = new Room("Room 10", "Gerudo and Hylian corpse everywhere. You can see a door to the west.");
        Room enemiesRoom2 = new Room("Enemies room 2", "It's very dark you can't see anything, but you can hear strange sounds. Wait! A Chu-chu is coming from the shadows, be careful!");
        Room topTower = new Room("Top of the Tower of Evil", "A very giant room, crystal windows. You can ear the sound of an organ echoes in the room.");

        //CREATE-EXITS
        // Entrance & Atrium
        Exit exitEntranceToAtrium = new Exit("door", ExitDescription(atrium), Direction.NORTH, entrance, atrium);

        Exit exitAtriumToR1 = new Exit("door", ExitDescription(room1), Direction.WEST, atrium, room1);
        Exit exitAtriumToEntrance = new Exit("door", ExitDescription(entrance),Direction.SOUTH, atrium, entrance);
        Exit exitAtriumtoR4 = new Exit("stairs", ExitDescription(atrium), Direction.NORTH, atrium, room4);

        // Room 1
        Exit exitR1toR2 = new Exit("stairs", ExitDescription(room2), Direction.NORTH, room1, room2);
        Exit exitR1toR3 = new Exit("door", ExitDescription(room3), Direction.WEST, room1, room3);
        Exit exitR1toAtrium = new Exit("door", ExitDescription(atrium), Direction.EAST, room1, atrium);

        // Room 2
        Exit exitR2toWpR = new Exit("door", ExitDescription(wizardPotionRoom), Direction.WEST, room2, wizardPotionRoom);
        exitR2toWpR.setLocked(true);
        Exit exitR2toR1 = new Exit("stairs", ExitDescription(room1), Direction.SOUTH, room2, room1);

        // Wizard Potion Room
        Exit exitWpRtoR2 = new Exit("door", ExitDescription(room2), Direction.EAST, wizardPotionRoom, room2);

        // Room 3
        Exit exitR3toR1 = new Exit("door", ExitDescription(room1), Direction.EAST, room3, room1);
        Exit exitR3toR8 = new Exit("door", ExitDescription(room8), Direction.WEST, room3, room8);
        exitR3toR8.setLocked(true);

        // Room 4
        Exit exitR4toAtrium = new Exit("stairs", ExitDescription(atrium), Direction.SOUTH, room4, atrium);
        Exit exitR4toR5 = new Exit("door", ExitDescription(room5), Direction.NORTH, room4, room5);

        // Room 5
        Exit exitR5toR4 = new Exit("door", ExitDescription(room4), Direction.SOUTH, room5, room4);
        Exit exitR5toR6 = new Exit("door", ExitDescription(room6), Direction.EAST, room5, room6);
        Exit exitR5toEr2 = new Exit("door", ExitDescription(enemiesRoom2), Direction.WEST, room5, enemiesRoom2);
        exitR5toEr2.setLocked(true);
        Exit exitR5toTT = new Exit("stairs", ExitDescription(topTower), Direction.NORTH, room5, topTower);
        exitR5toTT.setLocked(true);

        // Room 6
        Exit exitR6toR5 = new Exit("door", ExitDescription(room5), Direction.WEST, room6, room5);
        Exit exitR6toEr1 = new Exit("door", ExitDescription(enemiesRoom1), Direction.EAST, room6, enemiesRoom1);
        Exit exitR6ToI = new Exit("stairs", ExitDescription(iceTemple), Direction.SOUTH, room6, iceTemple);

        // Enemies Room 1
        Exit exitEr1toR6 = new Exit("door", ExitDescription(room6), Direction.WEST, enemiesRoom1, room6);
        Exit exitEr1ToR7 = new Exit("door", ExitDescription(room7), Direction.SOUTH, enemiesRoom1, room7);
        exitEr1ToR7.setLocked(true);

        // Ice Temple
        Exit exitItoR6 = new Exit("stairs", ExitDescription(room6), Direction.NORTH, iceTemple, room6);
        Exit exitItoLor = new Exit("door", ExitDescription(lockedRoom), Direction.SOUTH, iceTemple, lockedRoom);
        exitItoLor.setLocked(true);

        // Waterfall/locked room
        Exit exitLorToI = new Exit("door", ExitDescription(iceTemple), Direction.NORTH, lockedRoom, iceTemple);
        Exit exitLorToW = new Exit("stairs", ExitDescription(windTemple), Direction.EAST, lockedRoom, windTemple);

        // Wind Temple
        Exit exitWtoLor = new Exit("stairs", ExitDescription(lockedRoom), Direction.WEST, windTemple, lockedRoom);

        // Room 7
        Exit exitR7toEr1 = new Exit("door", ExitDescription(enemiesRoom1), Direction.NORTH, room7, enemiesRoom1);
        Exit exitR7toLr = new Exit("door", ExitDescription(lavaRoom), Direction.EAST, room7, lavaRoom);

        // Lava Room
        Exit LrToR7 = new Exit("door", ExitDescription(room7), Direction.WEST, lavaRoom, room7);
        Exit LrToE = new Exit("cave", ExitDescription(earthTemple), Direction.NORTH, lavaRoom, earthTemple);
        Exit LrToF = new Exit("cave", ExitDescription(fireTemple), Direction.SOUTH, lavaRoom, fireTemple);

        // Earth Temple
        Exit exitEtoLr = new Exit("cave", ExitDescription(lavaRoom), Direction.SOUTH, earthTemple, lavaRoom);
        // Fire Temple
        Exit exitFtoLr = new Exit("cave", ExitDescription(lavaRoom), Direction.NORTH, fireTemple, lavaRoom);

        // Room 8
        Exit exitR8toR3 = new Exit("door", ExitDescription(room3), Direction.EAST, room8, room3);
        Exit exitR8toR9 = new Exit("door", ExitDescription(room9), Direction.NORTH, room8, room9);

        // Room 9
        Exit exitR9toR8 = new Exit("door", ExitDescription(room8), Direction.SOUTH, room9, room8);
        Exit exitR9toL = new Exit("stairs", ExitDescription(lightingTemple), Direction.NORTH, room9, lightingTemple);

        // Lighting Temple
        Exit exitLtoR9 = new Exit("stairs", ExitDescription(room9), Direction.SOUTH, lightingTemple, room9);
        Exit exitLtoR10 = new Exit("door", ExitDescription(room10), Direction.EAST, lightingTemple, room10);
        exitLtoR10.setLocked(true);

        // Room 10
        Exit exitR10toL = new Exit("door", ExitDescription(lightingTemple), Direction.WEST, room10, lightingTemple);
        Exit exitR10toEr2 = new Exit("door", ExitDescription(enemiesRoom2), Direction.NORTH, room10, enemiesRoom2);

        // Enemies Room 2
        Exit Er2toR10 = new Exit("door", ExitDescription(room10), Direction.SOUTH, enemiesRoom2, room10);
        Exit Er2toR5 = new Exit("door", ExitDescription(room5), Direction.EAST, enemiesRoom2, room5);

        // Top of the Tower of Evil: NO COME BACK, CONFRONT GANONDORF WITH WHAT YOU HAVE. IF YOU FAIL, RESTART THE GAME.

        //CREATE-ITEMS
        Item rock = new Item("rock", "It's just a simple stupid rock.");
        Item sword = new Item("mastersword", "The Blade of Evil's Bane.", ItemType.WEAPON);
        Item bombs = new Item("bombs", "A bag full of bombs provided by Sheika's technology.", ItemType.WEAPON);
        Item bow = new Item("bow", "A bow used by the proud warrios of Hyrule.", ItemType.WEAPON);
        Item arrows = new Item("arrows", "A bag full of arrows used by the proud warrios of Hyrule.", ItemType.WEAPON);
        Item potion = new Item("potion", "A potion used to heal wounds.", ItemType.POWER);
        Item fairy = new Item("fairy", "A fairy used to restore completly health.", ItemType.POWER);
        Item scabbard = new Item("scabbard", "A scabbard: used to hold swords.", ItemType.HOLDER);
        Item quiver = new Item("quiver", "A quiver: used to hold arrows.", ItemType.HOLDER);
        Item shield = new Item("HylianShield", "A shield wielded by the proud warrios of Hyrule", ItemType.WEAPON);
        Item spiritualDiamond = new Item("WindSpiritualDiamond", "The spiritual stone of Wind. Use it to overpower your ring.", ItemType.POWER);
        Item spiritualPearl = new Item("EarthSpiritualPearl", "The spiritual pearl of Earth. Use it to overpower your ring", ItemType.POWER);
        Item spiritualCrystal = new Item("LightingSpiritualPearl", "The spiritual pearl of Earth. Use it to overpower your ring", ItemType.POWER);
        Item spiritualGem = new Item("WaterSpiritualGem", "The spiritual pearl of Earth. Use it to overpower your ring", ItemType.POWER);
        Item spiritualStone = new Item("FireSpiritualStone", "The spiritual pearl of Earth. Use it to overpower your ring", ItemType.POWER);
        Item watch = new Item("watch", "The times is "+ Globals.getCurrentTime());
        Item book = new Item("book", "\"Hylia: Myths and History\": and encyclopedia about the legends of Hyrule, pretty interesting.");

        //CREATE-PLAYER
        player = new TheHero("Hero", "You are the mighty hero of the legends, Link, the one who evil's bane.", entrance,3);

        //CREATE-NPCs
        NPC owl = new NPC("OwlStatue", "A solid rock statue represents a owl. Seems alive.", "Stuck in this room? Check out the "+room7.getName()+". First however, you must have the key. If you don't, find one.", room3);
        NPC wizard = new NPC("ChainedSheikaWizard", "Bone skin, more bone than skin. He is dressed in a wizard's tunic.", "It's a dangerous place to go alone this castle, be careful! Ganondorf is unstoppable, is waiting for you!", wizardPotionRoom);
        NPC Zelda = new NPC("ZeldaSpirit", "A light coming from your weapon. She's the spirit of the Princess Zelda within the Master Sword!", "Be careful Link! To defeat Ganon you must have the powers of the Gods to overpower the Master Sword! Be careful... save Hyrule.", atrium);
        wizard.Insert(watch);
        wizard.Insert(book);

        //CREATE-Q&As
        QAndA skullSheika = new QAndA("SkullSheika","Bone skin's Sheika monk. It's staring you with an evil smile.",
                "Welcome Hero of the Legends, are you here to pick the Spiritual Pearl of Earth, aren't you?\n" +
                        "You must solve my riddles first to proove you're worthy.\nWhen you're ready, ASK.", earthTemple);
        QAndA skullRito = new QAndA("SkullRito","Bone skin's Rito. It's staring you with an evil smile.",
                "Welcome Hero of the Legends, are you here to pick the Spiritual Diamond of Wind, aren't you?\n" +
                        "You must solve my riddles first to proove you're worthy.\nWhen you're ready, ASK.", windTemple);
        QAndA skullZora = new QAndA("SkullZora","Bone skin's Zora. It's staring you with an evil smile.",
                "Welcome Hero of the Legends, are you here to pick the Spiritual Gem of Water, aren't you?\n" +
                        "You must solve my riddles first to proove you're worthy.\nWhen you're ready, ASK.", iceTemple);
        QAndA skullGerudo = new QAndA("SkullGerudo","Bone skin's female warrior Gerudo. It's staring you with an evil smile.",
                "Welcome Hero of the Legends, are you here to pick the Spiritual Crystal of Lighting, aren't you?\n" +
                        "You must solve my riddles first to proove you're worthy.\nWhen you're ready, ASK.", lightingTemple);
        QAndA skullGoron = new QAndA("SkullGoron","Bone skin's Goron. It's staring you with an evil smile.",
                "Welcome Hero of the Legends, are you here to pick the Spiritual Stone of Fire, aren't you?\n" +
                        "You must solve my riddles first to proove you're worthy.\nWhen you're ready, ASK.", fireTemple);

        //CREATE-RIDDLES
        Map<Integer, String> riddleEarth = new HashMap<>();
        riddleEarth.put(1,"It cannot be seen, cannot be felt,\n" +
                "Cannot be heard, cannot be smelt.\n" +
                "It lies behind stars and under hills,\n" +
                "And empty holes it fills.\n" +
                "It comes first and follows after,\n" +
                "Ends life, kills laughter.");
        riddleEarth.put(2,"A box without hinges, key, or lid,\n" +
                "Yet golden treasure inside is hid.");
        riddleEarth.put(3,"Thirty white horses on a red hill,\n" +
                "First they champ,\n" +
                "Then they stamp,\n" +
                "Then they stand still.");
        riddleEarth.put(4,"What has roots as nobody sees,\n" +
                "Is taller than trees,\n" +
                "Up, up it goes,\n" +
                "And yet never grows?");
        skullSheika.setRiddles(riddleEarth);

        Map<Integer, String> riddleWind = new HashMap<>();
        riddleWind.put(1,"Alive without breath,\n" +
                "As cold as death;\n" +
                "Never thirsty, ever drinking,\n" +
                "All in mail never clinking.");
        riddleWind.put(2,"This thing all things devours:\n" +
                "Birds, beasts, trees, flowers;\n" +
                "Gnaws iron, bites steel;\n" +
                "Grinds hard stones to meal;\n" +
                "Slays king, ruins town,\n" +
                "And beats high mountain down.");
        riddleWind.put(3,"An eye in a blue face\n" +
                "Saw an eye in a green face.\n" +
                "\"That eye is like to this eye\"\n" +
                "Said the first eye,\n" +
                "\"But in low place,\n" +
                "Not in high place.\"");
        riddleWind.put(4,"Voiceless it cries,\n" +
                "Wingless flutters,\n" +
                "Toothless bites,\n" +
                "Mouthless mutters.");
        skullRito.setRiddles(riddleWind);

        //Create Answers
        Map<Integer, String> answerEarth = new HashMap<>();
        answerEarth.put(1,"Dark");
        answerEarth.put(2,"An egg");
        answerEarth.put(3,"Teeth");
        answerEarth.put(4,"A mountain");
        skullSheika.setAnswers(answerEarth);

        Map<Integer, String> answerWind = new HashMap<>();
        answerWind.put(1,"Fish");
        answerWind.put(2,"Time");
        answerWind.put(3,"The sun");
        answerWind.put(4,"Wind");
        skullRito.setAnswers(answerWind);

        //CREATE-MONSTERS
        Monster moblin = new Monster("Moblin", "It's staring at you from the shadows, but you can't see it.", enemiesRoom1);
        Monster chuchu = new Monster("Chuchu", "It's staring at you from the shadows, but you can't see it.", enemiesRoom2);
        Boss Ganondorf = new Boss("Ganondorf", "The King of evil, it's playing piano.", topTower);

        //ADD-ENTITIES-TO-ROOMS

        // Add entities to Entrance & Atrium
        entrance.Insert(exitEntranceToAtrium);

        atrium.Insert(exitAtriumToR1);
        atrium.Insert(exitAtriumToEntrance);
        atrium.Insert(exitAtriumtoR4);
        atrium.Insert(Zelda);

        // Add entities to Room 1
        room1.Insert(exitR1toR2);
        room1.Insert(exitR1toR3);
        room1.Insert(exitR1toAtrium);

        // Add entities to Room 2
        room2.Insert(exitR2toWpR);
        room2.Insert(exitR2toR1);

        // Add entities to Wizard Potion Room
        wizardPotionRoom.Insert(exitWpRtoR2);

        // Add entities to Room 3
        room3.Insert(exitR3toR1);
        room3.Insert(exitR3toR8);

        // Add entities to Room 4
        room4.Insert(exitR4toAtrium);
        room4.Insert(exitR4toR5);

        // Add entities to Room 5
        room5.Insert(exitR5toR4);
        room5.Insert(exitR5toR6);
        room5.Insert(exitR5toEr2);
        room5.Insert(exitR5toTT);

        // Add entities to Room 6
        room6.Insert(exitR6toR5);
        room6.Insert(exitR6toEr1);
        room6.Insert(exitR6ToI);

        // Add entities to Enemies Room 1
        enemiesRoom1.Insert(exitEr1toR6);
        enemiesRoom1.Insert(exitEr1ToR7);

        // Add entities to Ice Temple
        iceTemple.Insert(exitItoR6);
        iceTemple.Insert(exitItoLor);

        // Add entities to Waterfall/locked room
        lockedRoom.Insert(exitLorToI);
        lockedRoom.Insert(exitLorToW);

        // Add entities to Wind Temple
        windTemple.Insert(exitWtoLor);

        // Add entities to Room 7
        room7.Insert(exitR7toEr1);
        room7.Insert(exitR7toLr);

        // Add entities to Lava Room
        lavaRoom.Insert(LrToR7);
        lavaRoom.Insert(LrToE);
        lavaRoom.Insert(LrToF);

        // Add entities to Earth Temple
        earthTemple.Insert(exitEtoLr);
        // Add entities to Fire Temple
        fireTemple.Insert(exitFtoLr);

        // Add entities to Room 8
        room8.Insert(exitR8toR3);
        room8.Insert(exitR8toR9);

        // Add entities to Room 9
        room9.Insert(exitR9toR8);
        room9.Insert(exitR9toL);

        // Add entities to Lighting Temple
        lightingTemple.Insert(exitLtoR9);
        lightingTemple.Insert(exitLtoR10);

        // Add entities to Room 10
        room10.Insert(exitR10toL);
        room10.Insert(exitR10toEr2);

        // Add entities to Enemies Room 2
        room2.Insert(Er2toR10);
        room2.Insert(Er2toR5);

        //ADD-ALL-ENTITIES-TO-WORLD
        entities.add(entrance);
        entities.add(atrium);
        entities.add(room1);
        entities.add(room2);
        entities.add(room3);
        entities.add(room4);
        entities.add(room5);
        entities.add(room6);
        entities.add(room7);
        entities.add(room8);
        entities.add(room9);
        entities.add(room10);
        entities.add(wizardPotionRoom);
        entities.add(iceTemple);
        entities.add(lockedRoom);
        entities.add(windTemple);
        entities.add(enemiesRoom1);
        entities.add(lavaRoom);
        entities.add(earthTemple);
        entities.add(fireTemple);
        entities.add(lightingTemple);
        entities.add(enemiesRoom2);
        entities.add(topTower);
        entities.add(exitEntranceToAtrium);
        entities.add(exitAtriumToR1);
        entities.add(exitAtriumToEntrance);
        entities.add(exitAtriumtoR4);
        entities.add(exitR1toR2);
        entities.add(exitR1toR3);
        entities.add(exitR1toAtrium);
        entities.add(exitR2toWpR);
        entities.add(exitR2toR1);
        entities.add(exitWpRtoR2);
        entities.add(exitR3toR1);
        entities.add(exitR3toR8);
        entities.add(exitR4toAtrium);
        entities.add(exitR4toR5);
        entities.add(exitR5toR4);
        entities.add(exitR5toR6);
        entities.add(exitR5toEr2);
        entities.add(exitR5toTT);
        entities.add(exitR6toR5);
        entities.add(exitR6toEr1);
        entities.add(exitR6ToI);
        entities.add(exitEr1toR6);
        entities.add(exitEr1ToR7);
        entities.add(exitItoR6);
        entities.add(exitItoLor);
        entities.add(exitLorToI);
        entities.add(exitLorToW);
        entities.add(exitWtoLor);
        entities.add(exitR7toEr1);
        entities.add(exitR7toLr);
        entities.add(LrToR7);
        entities.add(LrToE);
        entities.add(LrToF);
        entities.add(exitEtoLr);
        entities.add(exitFtoLr);
        entities.add(exitR8toR3);
        entities.add(exitR8toR9);
        entities.add(exitR9toR8);
        entities.add(exitR9toL);
        entities.add(exitLtoR9);
        entities.add(exitLtoR10);
        entities.add(exitR10toL);
        entities.add(exitR10toEr2);
        entities.add(Er2toR10);
        entities.add(Er2toR5);
        entities.add(Zelda);
        entities.add(owl);
        entities.add(wizard);
        entities.add(moblin);
        entities.add(skullSheika);
        entities.add(skullRito);
        entities.add(skullZora);
        entities.add(skullGerudo);
        entities.add(skullGoron);
        entities.add(Ganondorf);
        entities.add(rock);
        entities.add(sword);
        entities.add(scabbard);
        entities.add(spiritualDiamond);
        entities.add(spiritualPearl);
        entities.add(spiritualCrystal);
        entities.add(spiritualGem);
        entities.add(spiritualStone);
        entities.add(watch);
        entities.add(book);
        entities.add(bombs);
        entities.add(bow);
        entities.add(arrows);
        entities.add(potion);
        entities.add(fairy);
        entities.add(quiver);
        entities.add(shield);


        player.getContains().add(scabbard);
        player.getContains().add(sword);
        player.getContains().add(shield);

        //SHOW-INIT-CURRENT-ROOM
        player.DescribeCurrentRoom();
        gameOver = false;
    }

    public String ExitDescription(Room room) {
        return "Exit to the " + room.getName() + ".";
    }

    public void HandleInput(List<String> words) {

        switch (words.size()) {
            case 0:
                System.err.println("ERROR: Type something!");
                break;
            case 1:
            case 2:
                HandleAction(words);
                break;
            default:
                System.out.println("ERROR: Please type 2 words max!");
                break;
        }
    }

    public void setPlayer(TheHero player) {
        this.player = player;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void HandleAction(List<String> words) {

        String actionName = words.get(0).toLowerCase();
        String actionParameter = "";
        if (words.size() > 1) {
            actionParameter = words.get(1).toLowerCase();
        }

        if (ACTION_INVENTORY.equals(actionName)) {
            player.Inventory();
        }
        else if (ACTION_LOOK.equals(actionName) || ACTION_SEE.equals(actionName)) {
            player.Look_Player(actionParameter);
        }
        else if (ACTION_GO.equals(actionName) || ACTION_WALK.equals(actionName)) {
            player.Go(actionParameter);
        }
        else if (ACTION_TAKE.equals(actionName) || ACTION_GRAB.equals(actionName)) {
            player.Take(actionParameter);
        }
        else if (ACTION_DROP.equals(actionName) || ACTION_LEAVE.equals(actionName)) {
            player.Drop(actionParameter);
        }
        else if (ACTION_EQUIP.equals(actionName) || ACTION_ARM.equals(actionName)) {
            player.Equip(actionParameter);
        }
        else if (ACTION_UNEQUIP.equals(actionName) || ACTION_UNARM.equals(actionName)) {
            player.Unequip(actionParameter);
        }
        else if (ACTION_ATTACK.equals(actionName) || ACTION_FIGHT.equals(actionName)) {
            gameOver = player.Attack(actionParameter);
        }
        else if (ACTION_LOCK.equals(actionName) || ACTION_CLOSE.equals(actionName)) {
            player.Lock(actionParameter);
        }
        else if (ACTION_UNLOCK.equals(actionName) || ACTION_OPEN.equals(actionName)) {
            player.Unlock(actionParameter);
        }
        else if (ACTION_LOOT.equals(actionName) || ACTION_STEAL.equals(actionName)) {
            player.Loot(actionParameter);
        }
        else if (ACTION_TALK.equals(actionName) || ACTION_SPEAK.equals(actionName)) {
            player.Talk(actionParameter);
        }
        else if (ACTION_HELP.equals(actionName)) {
            ShowHelp();
        }
        else
            System.out.println("Invalid action, please try again.");;
    }

    public String ShowCommand(String str, String str2) {
        String result = "- '" + str.toUpperCase() + "'";
        if (str2.isEmpty()) {
            result += " command";
        }
        else {
            result += " or '" + str2.toUpperCase() + "'";
            result += " commands";
        }
        return result;
    }

    public String ShowHelp() {
        System.out.println("Action Commands:");
        System.out.println(ShowCommand(ACTION_INVENTORY, "") + " shows all the items you have.");
        System.out.println(ShowCommand(ACTION_LOOK, ACTION_SEE) + " describe the object you specify.");
        System.out.println(ShowCommand(ACTION_GO, ACTION_WALK) + " move the player to a different room. The parameter must be a direction.");
        System.out.println(ShowCommand(ACTION_TAKE, ACTION_GRAB) + " put an item inside your inventory.");
        System.out.println(ShowCommand(ACTION_DROP, ACTION_LEAVE) + " drop the item from your inventory and place it in the current room.");
        System.out.println(ShowCommand(ACTION_EQUIP, ACTION_ARM) + " hold that item in your hand to use it.");
        System.out.println(ShowCommand(ACTION_UNEQUIP, ACTION_UNARM) + " unhold that item from your hand.");
        System.out.println(ShowCommand(ACTION_ATTACK, ACTION_FIGHT) + " attack a monster in the current room. You will need a weapon. The parameter must be a direction.");
        System.out.println(ShowCommand(ACTION_LOCK, ACTION_CLOSE) + " close an exit. You will need a key. The parameter must be a direction.");
        System.out.println(ShowCommand(ACTION_UNLOCK, ACTION_OPEN) + " opens an exit. You will need a key. The parameter must be a direction.");
        System.out.println(ShowCommand(ACTION_LOOT, ACTION_STEAL) + " takes all items from an NPC to your inventory.");
        System.out.println(ShowCommand(ACTION_TALK, ACTION_SPEAK) + " to have a little chit chat with an NPC.");
        System.out.println(ShowCommand(ACTION_EXIT, ACTION_QUIT) + " end the game.");
        String help = "Action Commands:\n"+ShowCommand(ACTION_INVENTORY, "") + " shows all the items you have."+ShowCommand(ACTION_LOOK, ACTION_SEE) + " describe the object you specify."+ShowCommand(ACTION_GO, ACTION_WALK) + " move the player to a different room. The parameter must be a direction."+ShowCommand(ACTION_TAKE, ACTION_GRAB) + " put an item inside your inventory."+ShowCommand(ACTION_DROP, ACTION_LEAVE) + " drop the item from your inventory and place it in the current room."+ShowCommand(ACTION_EQUIP, ACTION_ARM) + " hold that item in your hand to use it."+ShowCommand(ACTION_UNEQUIP, ACTION_UNARM) + " unhold that item from your hand."+ShowCommand(ACTION_ATTACK, ACTION_FIGHT) + " attack a monster in the current room. You will need a weapon. The parameter must be a direction."+ShowCommand(ACTION_LOCK, ACTION_CLOSE) + " close an exit. You will need a key. The parameter must be a direction."+ShowCommand(ACTION_UNLOCK, ACTION_OPEN) + " opens an exit. You will need a key. The parameter must be a direction."+ShowCommand(ACTION_LOOT, ACTION_STEAL) + " takes all items from an NPC to your inventory."+ShowCommand(ACTION_TALK, ACTION_SPEAK) + " to have a little chit chat with an NPC."+ShowCommand(ACTION_EXIT, ACTION_QUIT) + " end the game.";
        return help;
    }

}
