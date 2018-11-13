package pl.put.poznan.building_info.structures;
import java.util.ArrayList;
import java.util.List;

public class Level extends Location{

    private ArrayList<Room> rooms = new ArrayList<Room>();
    private float area;
    private float cube;
    private float heating;
    private float lightPower;
    
    public Level(int id, String name){
        super(id, name);
        Room room;
         float a=0;
         float c=0;
         float h=0;
         float l=0;
        for (int i = 0; i < rooms.size(); i++) {
			room=rooms.get(i);
			a+=room.getArea();
			c+=room.getCube();
			h+=room.getHeating();
			l+=room.getLightPower();
        }
        this.area = a;
        this.cube = c;
        this.heating = h;
        this.lightPower = l;
        

    }

    public void addRoom(Room newRoom){
        rooms.add(newRoom);
        this.area = this.area+newRoom.getArea();
        this.cube = this.cube+newRoom.getCube();
        this.heating = this.heating+newRoom.getHeating();
        this.lightPower = this.lightPower+newRoom.getLightPower();
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }
    
    public float getHeating() {
        return heating;
    }
    
    public float getCube() {
    	return cube;
    }
    
    public float getArea() {
    	return area;
    }
    
    public float getLightPower() {
    	return lightPower;
    }
    public void setArea(float area){
        this.area = area;
    }
    public void setCube(float cube){
        this.cube = cube;
    }
    public void setHeating(float heating){
        this.heating = heating;
    }
    public void setLightPower(float lightPower){
        this.lightPower = lightPower;
    }
    
}