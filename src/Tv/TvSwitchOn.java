package Tv;
import Command.Command;
public class TvSwitchOn implements Command {
    private TvController tvController;
    public TvSwitchOn(TvController tvController){
        this.tvController = tvController;
    }
    @Override
    public String execute() {
        return tvController.TvSwitchOn();
    }

}


