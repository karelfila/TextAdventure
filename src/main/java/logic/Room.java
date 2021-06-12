package logic;

import javax.swing.*;

public class Room {

    private String riddle;
    private String answer;

    private Room[] nearRooms;

    public Room[] getNearRooms() {
        return nearRooms;
    }

    public void setNearRooms(Room[] nearRooms) {
        this.nearRooms = nearRooms;
    }

    private boolean isPlayerInside;
    private boolean isGuarded;

    public Room(String riddle, String answer, boolean isPlayerInside, boolean isGuarded) {
        this.riddle = riddle;
        this.isPlayerInside = isPlayerInside;
        this.isGuarded = isGuarded;
        this.answer = answer;
    }

    public boolean isPlayerInside() {
        return isPlayerInside;
    }

    public void setPlayerInside(boolean playerInside) {
        isPlayerInside = playerInside;
    }

    public boolean isGuarded() {
        return isGuarded;
    }

    public void setGuarded(boolean guarded) {
        isGuarded = guarded;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String description) {
        this.riddle = description;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        answer = answer;
    }

    public void setNearRooms(Room l1, Room r1, Room d1) {
        nearRooms = new Room[3];
        nearRooms[0] = l1;
        nearRooms[1] = r1;
        nearRooms[2] = d1;
    }



    /* private Room down;
    private Room left;
    private Room right;
    */

  /*  public Room getDown() {
        return down;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room getLeft() {
        return left;
    }

    public void setLeft(Room left) {
        this.left = left;
    }

    public Room getRight() {
        return right;
    }

    public void setRight(Room right) {
        this.right = right;
    }
    */
}
