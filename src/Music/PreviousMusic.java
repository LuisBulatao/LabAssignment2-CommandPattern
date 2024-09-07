package Music;
import Command.Command;
public class PreviousMusic implements Command{
    private MusicController musicController;

    public PreviousMusic(MusicController musicController){
        this.musicController = musicController;
    }
    @Override
    public String execute() {
        return musicController.PreviousMusic();
    }
}
