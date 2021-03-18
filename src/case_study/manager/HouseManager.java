package case_study.manager;

import case_study.commons.FuncWriteAndRead;
import case_study.commons.NameException;
import case_study.commons.Validation;
import case_study.models.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseManager {
    ServiceManger serviceManger = new ServiceManger();
    FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();

    public void addHouse() throws NameException {
        String idHouse = inputId();
        List<String> list = serviceManger.addService();
        list.add(0, idHouse);
        String roomStandard = serviceManger.inputRoomStandard();
        list.add(roomStandard);
        String otherAmenities = serviceManger.inputOtherAmenities();
        list.add(otherAmenities);
        String floor = serviceManger.inputFloor();
        list.add(floor);
        House house = new House(list.get(0), list.get(1), Double.parseDouble(list.get(2)),
                Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), list.get(5),
                list.get(6), list.get(7), Integer.parseInt(list.get(8)));
        List<House> houseList = new ArrayList<>();
        houseList.add(house);
        funcWriteAndRead.write("House.csv", houseList, true);
    }

    public void showHouse() {
        List<String[]> list = funcWriteAndRead.read("House.csv");
        List<House> houseList = new ArrayList<>();
        for (String[] houseInfo : list) {
            House house = new House(houseInfo[0], houseInfo[1], Double.parseDouble(houseInfo[2]),
                    Double.parseDouble(houseInfo[3]), Integer.parseInt(houseInfo[4]), houseInfo[5],
                    houseInfo[6], houseInfo[7], Integer.parseInt(houseInfo[8]));
            houseList.add(house);
        }
        for (House house : houseList) {
            System.out.println(house.showInfo());
        }
    }

    public String inputId() {
        do {
            System.out.print("Input id: ");
            String idHouse = scanner.nextLine();
            if (validation.checkIdHouse(idHouse)) {
                return idHouse;
            }
        } while (true);

    }
}
