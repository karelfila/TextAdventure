package logic;

import java.util.HashMap;

public class Map {

    private static HashMap<String, Room> rooms =  new HashMap<>();

    public static HashMap<String, Room> getRooms() {
        return rooms;
    }

    public static void generateMap() {
        Room C = new Room("", "", true, false);
        Room L1 = new Room("RiddleL1", "L1", false, false);
        Room L2 = new Room("RiddleL2", "L2", false, true);
        Room R1 = new Room("RiddleR1", "R1", false, false);
        Room R2 = new Room("RiddleR2", "R2", false, true);
        Room D1 = new Room("RiddleD1", "D1", false, false);
        Room D2 = new Room("RiddleD2", "D2", false, true);
        Room DL1 = new Room("RiddleDL1", "DL1", false, true);
        Room DR1 = new Room("RiddleDL2", "DL2", false, true);

        C.setNearRooms(L1, D1, R1);

        L1.setNearRooms(L2, DL1, null);
        L2.setNearRooms(null, null, null);

        R1.setNearRooms(null, DR1, R2);
        R2.setNearRooms(null, null, null);

        D1.setNearRooms(DL1, D2, DR1);
        D2.setNearRooms(null, null, null);

        DL1.setNearRooms(null, null, null);
        DR1.setNearRooms(null, null, null);

        rooms.put("C", C);                      // room.get("C")  =>  Room C = new Room...

        rooms.put("L1", L1);
        rooms.put("R1", R1);
        rooms.put("D1", D1);

        rooms.put("L2", L2);
        rooms.put("R2", R2);
        rooms.put("D2", D2);

        rooms.put("DL1", DL1);
        rooms.put("DR1", DR1);

    }
}
