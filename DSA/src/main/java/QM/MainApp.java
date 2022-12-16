/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QM;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nguyen Long
 */
public class MainApp {
    private static Scanner sc = new Scanner(System.in);
    private static Queue MQ = new Queue(10);
    public static void main(String[] args) throws Exception {
        int choice = 0;
        try{
            do{
                menu();
                System.out.print("Select functions");
                choice = getSc().nextInt();
                getSc().nextLine();
                switch(choice){
                    case 1 -> {
                        System.out.print("Message sender:");
                        String sPerson = getSc().nextLine();
                        System.out.print("Message content:");
                        String message = getSc().nextLine();
                        System.out.print("Message recipient:");
                        String rPerson = getSc().nextLine();
                        if(message.toCharArray().length > 250){
                            System.out.println("250 characters limit !");
                            break;
                        }
                        Message mess = new Message(sPerson, message,rPerson);
                        getMQ().enqueue(mess);
                    }
                    case 2 -> getMQ().display();
                    case 3 -> getMQ().dequeue();
                    case 4 -> {
                        System.out.println("Thank you for using system services!");
                        return;
                    }
                    default -> System.out.println("Please enter the correct function number, thanks!");
                }
            }while(choice != 4);
        }catch(InputMismatchException e){
            System.out.println("Please enter the correct function number, thanks!");
        }
    }

    private static void menu() {
        System.out.println("|---------------o0o---------------|");
        System.out.println("|    1. Input                     |");          
        System.out.println("|    2. Display                   |");
        System.out.println("|    3. Dequeue                   |");
        System.out.println("|    4. Exit                      |");
        System.out.println("|---------------------------------|");
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }

    /**
     * @return the MQ
     */
    public static Queue getMQ() {
        return MQ;
    }

    /**
     * @param aMQ the MQ to set
     */
    public static void setMQ(Queue aMQ) {
        MQ = aMQ;
    }
    
}

