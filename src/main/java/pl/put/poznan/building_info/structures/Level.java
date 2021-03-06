package pl.put.poznan.building_info.structures;
/** Klasa reprezentujaca poziom budynku. Zawiera podstawowe informacje o obiekcie. Dziedziczy z klasy LocationGroup
 * @since 0.1
 */

import java.util.ArrayList;
//import java.util.List;

public class Level extends LocationGroup{

    
    /**
     * <p>Konstruktor tworzacy poziom wraz z podstawowymi informacjami o nim</p>
     *
     * @param id- unikalna wartosc opisujaca pomieszczenie
     * @param name-nazwa obiektu
     * dziedziczone z klasy LocationGroup
     */
    public Level(int id, String name){
        super(id, name, "Level");
    }

    /**
     * <p>Dodaje do listy pomieszczen dla poziomu nowy obiekt klasy Room</p>
     * @param newRoom - dodawany obiekt
     */
    @Override
    public void addRoom(Room newRoom){
        super.addLocation(newRoom);
    }
    
    /**
     * <p>Funkcja okreslajaca typ lokalizacji jako Level</p>
     */
    @Override
    public boolean isLevel(){
        return true;
    }

    /**
     * <p>Zwraca wszystkie obiekty typu Room wchodzace w sklad poziomu</p>
     * @return Lista pokoi
     */
    public ArrayList<Room> getRooms(){
        ArrayList<Room> rooms = new ArrayList<Room>();
        ArrayList<Location> locations = this.getLocations();

        for(Location l:locations){
            rooms.add((Room) l);
        }
        return rooms;
    }
}