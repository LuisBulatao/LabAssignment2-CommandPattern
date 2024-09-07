package Light;
import Command.Command;
public class IncreaseBrightness implements Command {
    private LightController light;
    public IncreaseBrightness(LightController light) {
        this.light = light;
    }
    @Override
    public String execute() {
        return light.IncreaseBrightness();
    }
}

