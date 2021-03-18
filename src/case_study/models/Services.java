package case_study.models;

public abstract class Services {
    private String idService;
    private String nameService;
    private double useArea;
    private double cost;
    private int amountOfPeople;
    private String typeRent;

    public Services() {
    }

    public Services(String idService, String nameService, double useArea, double cost, int amountOfPeople, String typeRent) {
        this.idService = idService;
        this.nameService = nameService;
        this.useArea = useArea;
        this.cost = cost;
        this.amountOfPeople = amountOfPeople;
        this.typeRent = typeRent;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return idService + ","
                + nameService + ","
                + useArea + ","
                + cost + ","
                + amountOfPeople + ","
                + typeRent;
    }

    public abstract String showInfo();
}
