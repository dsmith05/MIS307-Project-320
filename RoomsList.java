
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @abbyFridgen User
 */

public class RoomsList
{
   public static void main(String[] args) 
   {
   Scanner in = new Scanner(System.in);
   
   boolean done = false;
   boolean done2 = false;
   while(!done) 
   {
   Rooms first = new Rooms();
   System.out.println("Do you need to add rooms? Y/N");
   while(!done2){
       
      // System.out.println("Don you need to add rooms? Y/N");
       String response2 = in.next();
       if(response2.equals("Y")) {
       System.out.println("Single Rooms?: ");
       first.addSingle(in.nextInt());
       System.out.println("Double Rooms?: ");
       first.addDouble(in.nextInt());
       System.out.println("Triple Rooms?: ");
       first.addTriple(in.nextInt());
       System.out.println("Do you need to add more rooms?");
       }
       else {
           System.out.println("Do you need to Remove Rooms? Y/N?");
           String response = in.next();
           if(response.equals("Y"))
           {
               System.out.println("Single Rooms?: ");
               first.removeSingle(in.nextInt());
               System.out.println("Double Rooms?: ");
               first.removeDouble(in.nextInt());
               System.out.println("Triple Room?");
               first.removeTriple(in.nextInt());
               done2 = true;
           }
           else 
           {
               done2 = true;
           }
        
        
   }
}
       System.out.println("Total for Rooms is: ");
       first.getRooms();
       done = true;
            }
          }
}