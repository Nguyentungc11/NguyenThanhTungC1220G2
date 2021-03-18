package case_study.models;

public class House extends Services {
    private String roomStandard;
    private String otherAmenities;
    private int floor;

    public House() {
    }

    public House(String idService, String nameService, double useArea, double cost, int amountOfPeople, String typeRent, String roomStandard, String otherAmenities, int floor) {
        super(idService, nameService, useArea, cost, amountOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.otherAmenities = otherAmenities;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return "House :" +
                "\n IdService = " + getIdService() +
                "\n Area = " + getUseArea() +
                "\n Cost = " + getCost() +
                "\n Amount of people = " + getAmountOfPeople() +
                "\n TypeRent = " + getTypeRent() +
                "\n roomStandard='" + roomStandard + '\'' +
                "\n otherAmenities='" + otherAmenities + '\'' +
                "\n floor=" + floor;
    }

    @Override
    public String toString() {
        return super.toString() + ","
                + roomStandard + ","
                + otherAmenities + ","
                + floor;
    }
}

