package casetudy.task_2.model;

import casetudy.task_2.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double usableArea, int cost, int maxPeople, String typeRental) {
        super(nameService, usableArea, cost, maxPeople, typeRental);
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double usableArea, int cost, int maxPeople, String typeRental, String freeService) {
        super(nameService, usableArea, cost, maxPeople, typeRental);
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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
