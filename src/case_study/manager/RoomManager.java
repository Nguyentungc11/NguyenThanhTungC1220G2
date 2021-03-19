package case_study.manager;

import case_study.commons.FuncWriteAndRead;
import case_study.commons.NameException;
import case_study.commons.Validation;
import case_study.models.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManager {
    ServiceManger serviceManger = new ServiceManger();
    FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();
    Validation validation = new Validation();
    Scanner scanner = new Scanner(System.in);

    public void addRoom() throws NameException {
        String id = inputId();
        List<String> list = serviceManger.addService();
        list.add(0, id);
        String freeService = serviceManger.inputFreeService();
        list.add(freeService);
        Room room = new Room(list.get(0), list.get(1), Double.parseDouble(list.get(2)),
                Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), list.get(5),
                list.get(6));
        List<Room> roomList = new ArrayList<>();
        roomList.add(room);
        funcWriteAndRead.write("Room.csv", roomList, true);
    }

    public List<Room>showRoom() {
        List<String[]> list = funcWriteAndRead.read("Room.csv");
        List<Room> roomList = new ArrayList<>();
        for (String[] roomInfo : list) {
            Room room = new Room(roomInfo[0], roomInfo[1], Double.parseDouble(roomInfo[2]),
                    Double.parseDouble(roomInfo[3]), Integer.parseInt(roomInfo[4]), roomInfo[5], roomInfo[6]);
            roomList.add(room);
        }
        for (int i = 0; i < roomList.size() ; i++) {
            System.out.println(i +1 + ". " + roomList.get(i).showInfo());
        }
        return roomList;
    }

    public String inputId() {
        do {
            System.out.print("Input id: ");
            String idRoom = scanner.nextLine();
            if (validation.checkIdRoom(idRoom)) {
                return idRoom;
            }
        } while (true);
    }
}
