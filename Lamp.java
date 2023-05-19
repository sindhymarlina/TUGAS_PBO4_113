public class Lamp {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is turned off");
    }

    public boolean isOn() {
        return isOn;
    }

    public class LampSwitch implements Switchable {
        @Override
        public void switchOn() {
            turnOn();
        }

        @Override
        public void switchOff() {
            turnOff();
        }
    }
}