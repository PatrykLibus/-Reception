package hotel;

public class Room {

    private int idRoom;
    private int numberRoom;
    private String start;
    private String end;
    private int beds;
    private boolean busy;

    public Room(int idRoom, int numberRoom, String start, String end, int beds, boolean busy) {

        this.idRoom = idRoom;
        this.numberRoom = numberRoom;
        this.start = start;
        this.end = end;
        this.beds = beds;
        this.busy = busy;

    }

    public int getIdRoom() {
        return idRoom;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public String getstart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public int getBeds() {
        return beds;
    }

    public boolean getBusy() {
        return busy;
    }
}
