package Thermostat;
import Command.Command;
public class DecreasedTemperature  implements Command {
    private ThermostatController thermostatController;

    public DecreasedTemperature(ThermostatController thermostatController){
        this.thermostatController = thermostatController;
    }

    @Override
    public String execute() {
        return thermostatController.DecreasedTemperature();
    }
}