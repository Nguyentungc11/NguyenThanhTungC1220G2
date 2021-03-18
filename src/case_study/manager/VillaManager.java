package case_study.manager;

import case_study.commons.FuncWriteAndRead;
import case_study.commons.NameException;
import case_study.commons.Validation;
import case_study.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager {
    ServiceManger serviceManger = new ServiceManger();
    FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();

    public void addVilla() throws NameException {
        String idVilla = inputId();
        List<String> list = serviceManger.addService();
        list.add(0, idVilla);
        String roomStandard = serviceManger.inputRoomStandard();
        list.add(roomStandard);
        String otherAmenities = serviceManger.inputOtherAmenities();
        list.add(otherAmenities);
        String poolArea = serviceManger.inputPoolArea();
        list.add(poolArea);
        String floor = serviceManger.inputFloor();
        list.add(floor);
        Villa villa = new Villa(list.get(0), list.get(1), Double.parseDouble(list.get(2)),
                Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), list.get(5),
                list.get(6), list.get(7), Double.parseDouble(list.get(8)), Integer.parseInt(list.get(9)));
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa);
        funcWriteAndRead.write("Villa.csv", villaList, true);

    }

    public void showVilla() {
        List<String[]> list = funcWriteAndRead.read("Villa.csv");
        List<Villa> villaList = new ArrayList<>();
        for (String[] villaInfo : list) {
            Villa villa = new Villa(villaInfo[0], villaInfo[1], Double.parseDouble(villaInfo[2]),
                    Double.parseDouble(villaInfo[3]), Integer.parseInt(villaInfo[4]), villaInfo[5],
                    villaInfo[6], villaInfo[7], Double.parseDouble(villaInfo[8]), Integer.parseInt(villaInfo[9]));
            villaList.add(villa);
        }
        for (Villa villa : villaList) {
            System.out.println(villa.showInfo());
        }
    }

    public String inputId() {
        do {
            System.out.print("Input id: ");
            String idVilla = scanner.nextLine();
            if (validation.checkIdVilla(idVilla)) {
                return idVilla;
            }
        } while (true);

    }
}
