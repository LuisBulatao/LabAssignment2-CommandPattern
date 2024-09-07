package Tv;
import Command.Command;
public class TvSwitchOff implements Command {
    private TvController tvController;
    public TvSwitchOff(TvController tvController){
        this.tvController = tvController;
    }

    @Override
    public String execute() {
        return tvController.TvSwitchOff();
    }
}

