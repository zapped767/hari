package lightcontrol;

public class KitchenRoomLight implements Light {
    private int brightness = 100; // Default full brightness

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen room light is ON at full brightness");
    }

    @Override
    public void off() {
        System.out.println("Kitchen room light is OFF");
    }

    @Override
    public void dim(int level) {
        this.brightness = level;
        System.out.println("Kitchen room light dimmed to " + level + "% brightness");
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}

