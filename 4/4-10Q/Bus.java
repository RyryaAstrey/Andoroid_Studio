package mypack;

public class Bus extends Vehicle implements Stopable {

    public Bus(int crewNum) {
        super(crewNum);
    }

    public void showCrewNum() {
        System.out.println("バスの乗客" + super.vehicle + "名");
    }

    void stop() {
        System.out.println("次止まります");
    }
}
