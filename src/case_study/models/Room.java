package case_study.models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String idService, String nameService, double useArea, double cost, int amountOfPeople, String typeRent, String freeService) {
        super(idService, nameService, useArea, cost, amountOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," + freeService;
    }

    @Override
    public String showInfo() {
        return "House :" +
                "\n IdService = " + getIdService() +
                "\n Area = " + getUseArea() +
                "\n Cost = " + getCost() +
                "\n Amount of people = " + getAmountOfPeople() +
                "\n TypeRent = " + getTypeRent() +
                "\n FreeService = " + freeService;
    }
}
