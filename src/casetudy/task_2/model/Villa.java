package casetudy.task_2.model;

import casetudy.task_2.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private float areaOfPool;
    private int floor;

    public Villa() {
    }

    public Villa(String nameService, double usableArea, int cost, int maxPeople, String typeRental) {
        super(nameService, usableArea, cost, maxPeople, typeRental);
    }

    @Override
    public String getInfo() {
        return null;
    }

    public Villa(String roomStandard, float areaOfPool, int floor) {
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.floor = floor;
    }

    public Villa(String nameService, double usableArea, int cost, int maxPeople, String typeRental, String roomStandard, float areaOfPool, int floor) {
        super(nameService, usableArea, cost, maxPeople, typeRental);
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.floor = floor;
    }

    public Villa(String s, String s1, double parseDouble, int parseInt, int parseInt1, String s2, String s3, double parseDouble1, int parseInt2) {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(float areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", floor=" + floor +
                '}';
    }
}
