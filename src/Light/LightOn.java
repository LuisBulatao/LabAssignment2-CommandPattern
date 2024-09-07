package Light;
import Command.Command;
public class LightOn implements Command{
    private LightController light;

    public LightOn(LightController light) {
        this.light = light;
    }
    @Override
    public String execute() {
        return light.LightOn();
    }
}
