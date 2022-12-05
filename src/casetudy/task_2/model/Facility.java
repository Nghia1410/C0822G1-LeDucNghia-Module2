package casetudy.task_2.model;

public abstract class Facility {
    private String nameService;
    private double usableArea;
    private int cost;
    private int maxPeople;
    private String typeRental;

    public Facility() {
    }

    public Facility(String nameService, double usableArea, int cost, int maxPeople, String typeRental) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.typeRental = typeRental;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}
