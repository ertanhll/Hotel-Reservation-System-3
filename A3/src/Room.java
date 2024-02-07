

public class Room {
    private String type;
    private int dailyCost;
    private int roomSize;
    private boolean hasBath;
    private Room [] rooms;
    
    public Room() {    
    	setRooms(new Room[] {
            new Room("Single", 100, 15, false),
            new Room("Double", 180, 30, false),
            new Room("Club", 250, 45, true),
            new Room("Family", 400, 50, false),
            new Room("Family with View", 450, 50, true),
            new Room("Suite", 650, 80, true)
    	});
   }
    
    public Room(String type, int dailyCost, int roomSize, boolean hasBath) {
        this.type = type;
        this.dailyCost = dailyCost;
        this.roomSize = roomSize;
        this.hasBath = hasBath;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return dailyCost;
    }

    public void setCost(int dailyCost) {
        this.dailyCost = dailyCost;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public boolean hasBath() {
        return hasBath;
    }

	public Room [] getRooms() {
		return rooms;
	}

	public void setRooms(Room [] rooms) {
		this.rooms = rooms;
	}
}
