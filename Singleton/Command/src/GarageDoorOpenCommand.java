public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void stop() {
        System.out.println("stop");
    }

    public void lightOn() {
        System.out.println("lightOn");

    }

    public void lightOff() {
        System.out.println("lightOff");
    }

    @Override
    public void execute() {
        garageDoor.on();
    }
}
