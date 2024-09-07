package Light;
import Command.Command;
public class DescreaseBrightness implements  Command{
    private LightController light;
    public DescreaseBrightness(LightController light) {
        this.light = light;
    }
    @Override
    public String execute() {
        return light.DescreaseBrightness();
    }
}
