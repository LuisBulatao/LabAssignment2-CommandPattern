package Thermostat;
import Command.Command;
public class IncreasedTemperature implements Command {
    private ThermostatController thermostatController;

    public IncreasedTemperature(ThermostatController thermostatController){
        this.thermostatController = thermostatController;
    }

    @Override
    public String execute() {
        return thermostatController.IncreasedTemperature();
    }
}
