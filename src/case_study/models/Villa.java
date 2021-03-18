package case_study.models;

public class Villa extends Services {
    private String roomStandard;
    private String otherAmenities;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, String otherAmenities, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.otherAmenities = otherAmenities;
        this.poolArea = poolArea;
        this.floor = floor;
    }


    public Villa(String idService, String nameService, double useArea, double cost,
                 int amountOfPeople, String typeRent, String roomStandard, String otherAmenities, double poolArea, int floor) {
        super(idService, nameService, useArea, cost, amountOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.otherAmenities = otherAmenities;
        this.poolArea = poolArea;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + ","
                + roomStandard + ","
                + otherAmenities + ","
                + poolArea + ","
                + floor;
    }

    @Override
    public String showInfo() {
        return "Villa {" +
                "IdService = " + getIdService() +
                ", Area = " + getUseArea() +
                ", Cost = " + getCost() +
                ", Amount of people = " + getAmountOfPeople() +
                ", TypeRent = " + getTypeRent() +
                ", roomStandard='" + roomStandard + '\'' +
                ", otherAmenities='" + otherAmenities + '\'' +
                ", poolArea=" + poolArea +
                " floor=" + floor + "}";
    }
}
