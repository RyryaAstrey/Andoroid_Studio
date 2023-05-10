package mypack;

public abstract class Vehicle {
    private int crewNum;

    public int Vehicle(int crewNum) {
        this.crewNum = crewNum;
        return this.crewNum;
    }

    public abstract void showCrewNum();
}
