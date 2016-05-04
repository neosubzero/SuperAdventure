public class Dungeon
{
        private Room balcony;
        private Room bedroom1;
        private Room bedroom2;
        private Room dining;
        private Room kitchen;
        private Room northHall;
        private Room southHall;
    
    public Dungeon()
    {
       this.balcony = new Room("You are on the Balcony. ");
       balcony.setSouth(northHall);
       
       this.bedroom1 = new Room("You are in the Master Bedroom. ");
       bedroom1.setNorth(bedroom2); bedroom1.setEast(southHall);
       
       this.bedroom2 = new Room("You are in the Guest Bedroom. ");
       bedroom2.setSouth(bedroom1); bedroom2.setEast(northHall);
       
       this.dining = new Room("You are in the Dining Room. ");
       dining.setNorth(kitchen); dining.setWest(southHall);
       
       this.kitchen = new Room("You are in the Kitchen. ");
       kitchen.setSouth(dining); kitchen.setWest(northHall);
       
       this.northHall = new Room("You are in the North Hall. ");
       northHall.setNorth(balcony); northHall.setSouth(southHall); northHall.setEast(kitchen); northHall.setWest(bedroom2);
       
       this.southHall = new Room("You are in the South Hall. ");
       southHall.setNorth(northHall); southHall.setEast(dining); southHall.setWest(bedroom1);
    }   
    
    public Room getRoom()
    {
        return this.southHall;
    }
}

