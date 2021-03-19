package case_study.controller;

import case_study.commons.NameException;
import case_study.manager.*;
import case_study.models.Customer;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    private boolean isExit;
    private boolean isBackToMainMenu;
    VillaManager villaManager = new VillaManager();
    HouseManager houseManager = new HouseManager();
    RoomManager roomManager = new RoomManager();
    CustomerManager customerManager = new CustomerManager();
    BookingManager bookingManager = new BookingManager();

    public void disPlayMainMenu() throws NameException {
        int choice = 0;
        do {
            System.out.println("MAIN MENU \n1.	Add New Services \n" +
                    "2.	Show Services \n" +
                    "3.	Add New Customer \n" +
                    "4.	Show Information of Customer \n" +
                    "5.	Add New Booking \n" +
                    "6.	Show Information of Employee \n" +
                    "7.	Exit");
            System.out.print("Input your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showListService();
                    break;
                case 3:
                    customerManager.addCustomer();
                    break;
                case 4:
                    customerManager.showCustomer();
                    break;
                case 5:
                    bookingManager.addNewBooking();
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("Input wrong");
                    break;
            }
            if (isExit){
                break;
            }
        }while (choice >=1 && choice <= 6);
    }

    public void addNewService() throws NameException {
        int choice = 0;
do {
    System.out.println("Menu: \n 1.Add new villa" +
                "\n 2.Add new house" +
                "\n 3.Add new room" +
                "\n4.Back to main menu." +
                "\n5.Exit.");
        System.out.print("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    villaManager.addVilla();
                    break;
                case 2:
                    houseManager.addHouse();
                    break;
                case 3:
                    roomManager.addRoom();
                    break;
                case 4:
                    isBackToMainMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Input wrong");
                    break;
            }
            if (isExit || isBackToMainMenu){
                break;
            }
        }while (choice >= 1 && choice <= 5);
    }

    public void showListService() throws NameException {
        int choice = 0;
        do {
        System.out.println("Menu: \n 1.Show  villa" +
                "\n 2.Show  house" +
                "\n 3.Show  room" +
                "\n 4.Show All name villa Not duplicate." +
                "\n 5.Show All name house Not duplicate." +
                "\n 6.Show All name room Not duplicate." +
                "\n7.Back to main menu." +
                "\n8.Exit.");

            System.out.print("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    villaManager.showVilla();
                    break;
                case 2:
                    houseManager.showHouse();
                    break;
                case 3:
                    roomManager.showRoom();
                    break;
                case 4:
                    villaManager.showVillaNotDup();
                    break;
                case 7:
                    isBackToMainMenu = true;
                    break;
                case 8:
                    isExit = true;
                    break;
                default:
                    System.out.println("Input wrong");
                    break;

            }
            if (isExit || isBackToMainMenu) {
                break;
            }
        }while (choice >= 1 && choice <= 5);

    }

    public static void main(String[] args) throws NameException {
        MainController mainController = new MainController();
        mainController.disPlayMainMenu();
    }
}
