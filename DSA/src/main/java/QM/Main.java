/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QM;

import java.util.Scanner;
import static QM.MainApp.getMQ;
import static QM.MainApp.getSc;

/**
 *
 * @author admin
 */
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Queue MQ = new Queue(10);

    public static void main(String[] args) {

        boolean check = true;
        main:
        do {
            System.out.print("Message sender:");
            String sPerson = getSc().nextLine();
            System.out.print("Message content:");
            String message = getSc().nextLine();
            System.out.print("Message recipient:");
            String rPerson = getSc().nextLine();
            if (message.toCharArray().length > 300) {
                System.out.println("300 characters limit !");
            }
            Message mess = new Message(sPerson, message, rPerson);
            getMQ().enqueue(mess);
            getMQ().display();
            getMQ().dequeue();
            System.out.println("The mesage has been sent!");
            System.out.println("Do you want to continue sending message? Y/N");
            String str = sc.nextLine();
            if (str.toLowerCase().equalsIgnoreCase("y")) {
                check = true;
            } else if (str.toLowerCase().equalsIgnoreCase("n")) {
                check = false;
            }
        } while (check);
    }
}
