package case_study.manager;

import case_study.commons.FuncWriteAndRead;
import case_study.models.Customer;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingManager {
    FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();
    CustomerManager customerManager = new CustomerManager();
    VillaManager villaManager = new VillaManager();
    RoomManager roomManager = new RoomManager();
    HouseManager houseManager = new HouseManager();
    Scanner scanner = new Scanner(System.in);
    public   void addNewBooking(){
        List<Customer> list = new ArrayList<>(customerManager.showCustomer());
        System.out.println("Choose customer to booking: ");
        int iCustomer = scanner.nextInt();
        Customer customer = list.get(iCustomer - 1);
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
        System.out.println("Choose type of service to book: ");
        int iTypeService = scanner.nextInt();
        switch (iTypeService){
            case 1:
                bookingVilla(customer);
                break;
            case 2:
                bookingHouse(customer);
                break;
            case 3:
                bookingRoom(customer);
                break;
        }
    }

    private void bookingRoom(Customer customer) {
        List<Room> roomList = new ArrayList<>(roomManager.showRoom());
        System.out.println("Choose room to book: ");
        int iVilla = scanner.nextInt();
        customer.setServices(roomList.get(iVilla -1));
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        funcWriteAndRead.write("Booking.csv",customerList,true);
    }

    private void bookingHouse(Customer customer) {
        List<House> houseList = new ArrayList<>(houseManager.showHouse());
        System.out.println("Choose house to book: ");
        int iHouse = scanner.nextInt();
        customer.setServices(houseList.get(iHouse -1));
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        funcWriteAndRead.write("Booking.csv",customerList,true);
    }

    private void bookingVilla(Customer customer) {
       List<Villa> villaList = new ArrayList<>(villaManager.showVilla());
        System.out.println("Choose villa to book: ");
        int iVilla = scanner.nextInt();
        customer.setServices(villaList.get(iVilla -1));
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        funcWriteAndRead.write("Booking.csv",customerList,true);

    }

}
