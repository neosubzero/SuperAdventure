import java.util.Scanner;

public class SuperDungeon
{
   
    
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         Dungeon dungeon = new Dungeon();
         boolean gameLoop = true;
         
         Room currentRoom = dungeon.getRoom();
        
        while (gameLoop == true) {
            
         Room northRoom = currentRoom.getNorth();
         Room southRoom = currentRoom.getSouth();
         Room eastRoom = currentRoom.getEast();
         Room westRoom = currentRoom.getWest();
            
            System.out.println(currentRoom.toString());
            System.out.println("Enter N) North, S) South, E) East, W) West, Q) Quit");
            
            char direction = input.next().charAt(0);
            System.out.println();
            
            if (direction == 'q' || direction == 'Q') {
                gameLoop = false;
            }
            else if (direction == 'n' || direction == 'N') {
                if (northRoom != null) {
                    currentRoom = northRoom;
                }
                else {
                    System.out.println("Invalid exit");
                }
            }
            else if (direction == 'e' || direction == 'E') {
                 if (eastRoom != null) {
                    currentRoom = eastRoom;
                }
                else {
                    System.out.println("Invalid exit");
                }
            }
            else if (direction == 'w' || direction == 'W') {
                 if (westRoom != null) {
                    currentRoom = westRoom;
                }
                else {
                    System.out.println("Invalid exit");
                }
            }
            else if (direction == 's' || direction == 'S') {
                if (southRoom != null) {
                    currentRoom = southRoom;
                }
                else {
                    System.out.println("Invalid exit");
                }
            }
            else {
                System.out.println(direction + " is an invalid choice");
            }
        }
        
        System.out.println("Thanks for playing");
    }
    
}