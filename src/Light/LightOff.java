package Light;
import Command.Command;
public class LightOff implements Command {
    private LightController light;

    public LightOff(LightController light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.LightOff();
    }
}
