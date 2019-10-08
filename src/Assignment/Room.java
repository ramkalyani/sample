package Assignment;

public class Room {
	
	private int roomId;
	private String roomType;
	private int floorNo;
	
	
	public Room()
	{
		
	}


	public int getRoomId() {
		return roomId;
	}


	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public int getFloorNo() {
		return floorNo;
	}


	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}


	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", floorNo=" + floorNo + "]";
	}
	
	}