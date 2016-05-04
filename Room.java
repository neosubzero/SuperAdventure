public class Room
{
    String description;
    Room north;
    Room west;
    Room east;
    Room south;
    
    public Room(String description)
    {
        this.description = description;
    }
    

    
    //Setters
    public void setNorth(Room north)
    {
         this.north = north;
    }
    
    public void setEast(Room east)
    {
        this.east = east;
    }
    
    public void setWest(Room west)
    {
        this.west = west;
    }
    
    public void setSouth(Room south)
    {
        this.south = south;
    }
    
   /* public setExits(Room n, s, e, w)
    {
        
    }*/
    
    //Getters
    public Room getNorth()
    {
     return this.north;   
    }
    
    public Room getEast()
    {
        return this.east;
    }
    
    public Room getWest()
    {
        return this.west;
    }
    
    public Room getSouth()
    {
        return this.south;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public String getExits()
    {
        String exitString = "Exits are ";
        
        if (this.north != null) {
            exitString += "North, ";
        }
         if (this.east != null) {
            exitString += "East, ";
        }
         if (this.west != null) {
            exitString += "West, ";
        }
         if (this.south != null) {
            exitString += "South";
        }
        return exitString;
    }
    
    public String toString()
    {
        return this.description + getExits(); 
    }
}