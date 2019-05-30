package hotel;

public class Room {

    private int idRoom;
    private int numberRoom;
    private String start;
    private String end;
    private int beds;
    private String busy;

    public Room(int idRoom, int numberRoom, String start, String end, int beds, String busy) {

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

    public String getBusy() {
        return busy;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setSnd(String end) {
        this.end = end;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setBusy(String busy) {
        this.busy = busy;
    }
}
