
package case_study.manager;

import case_study.commons.NameException;
import case_study.commons.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceManger {
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();

    public String inputName() throws NameException {
        do {
            System.out.print("Input name: ");
            String nameService = scanner.nextLine();
            if (validation.validateName(nameService)) {
                return nameService;
            }
        } while (true);
    }

    public String inputUseArea() {
        do {
            System.out.print("Input useArea: ");
            String area = scanner.nextLine();
            if (validation.checkArea(area)) {
                return area;
            }
        } while (true);

    }

    public String inputCost() {
        System.out.print("Input cost: ");
        return scanner.nextLine();
    }

    public String inputAmountOfPeople() {
        do {
            System.out.print("Input Amount of people: ");
            String amountOfPeople = scanner.nextLine();
            if (validation.checkNumberPeople(amountOfPeople)) ;
            return amountOfPeople;
        } while (true);

    }

    public String inputTypeRent() {
        System.out.print("Input type of rent: ");
        return scanner.nextLine();
    }

    public String inputRoomStandard() {
        System.out.print("Input room standard: ");
        return scanner.nextLine();
    }

    public String inputOtherAmenities() {
        System.out.print("Input other amenities: ");
        return scanner.nextLine();
    }

    public String inputPoolArea() {
        do {
            System.out.print("Input pool area: ");
            String poolArea = scanner.nextLine();
            if (validation.checkArea(poolArea)){
                return poolArea;
            }
        }while (true);

    }

    public String inputFloor() {
        do {
            System.out.print("Input floor: ");
            String floor = scanner.nextLine();
            if (validation.checkNumberFloor(floor)) {
                return floor;
            }
        } while (true);
    }

    public String inputFreeService() {
        System.out.print("Input free service: ");
        return scanner.nextLine();
    }

    public List<String> addService() throws NameException {
        List<String> serviceList = new ArrayList<>();
        String name = inputName();
        serviceList.add(name);
        String useArea = inputUseArea();
        serviceList.add(useArea);
        String cost = inputCost();
        serviceList.add(cost);
        String amountOfPeople = inputAmountOfPeople();
        serviceList.add(amountOfPeople);
        String typeRent = inputTypeRent();
        serviceList.add(typeRent);
        return serviceList;
    }

}
