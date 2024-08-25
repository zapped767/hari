package lightcontrol;


public class Test {
    public static void main(String[] args) {
        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command kitchenLightDim50 = new LightDimCommand(kitchenLight, 50);
        Command kitchenLightDim100 = new LightDimCommand(kitchenLight, 100);

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightDim30 = new LightDimCommand(livingRoomLight, 30);
        Command livingRoomLightDim100 = new LightDimCommand(livingRoomLight, 100);

        RemoteControl remote = new RemoteControl(4);

        // Control the kitchen light
        remote.setCommand(0, kitchenLightOn);
        remote.setCommand(1, kitchenLightOff);
        remote.setCommand(2, kitchenLightDim50);
        remote.setCommand(3, kitchenLightDim100);

        remote.pressButton(0); // Kitchen room light is ON at full brightness
        remote.pressButton(1); // Kitchen room light is OFF
        remote.pressButton(0); // Kitchen room light is ON at full brightness

        // Control the living room light
        remote.setCommand(0, livingRoomLightOn);
        remote.setCommand(1, livingRoomLightOff);

        remote.pressButton(0); // Living room light is ON at full brightness
        remote.pressButton(1); // Living room light is OFF
        remote.pressButton(0); // Living room light is ON at full brightness

        // Dim the kitchen light to 50% and then back to 100%
        remote.pressButton(2); // Kitchen room light dimmed to 50% brightness
        remote.pressButton(3); // Kitchen room light dimmed to 100% brightness

        // Dim the living room light to 30% and then back to 100%
        remote.setCommand(2, livingRoomLightDim30);
        remote.setCommand(3, livingRoomLightDim100);

        remote.pressButton(2); // Living room light dimmed to 30% brightness
        remote.pressButton(3); // Living room light dimmed to 100% brightness
    }
}

