package Music;
import Command.Command;
public class PlayMusic implements Command {
    private MusicController musicController;

    public PlayMusic(MusicController musicController){
        this.musicController = musicController;
    }
    @Override
    public String execute() {
        return musicController.PlayMusic();
    }
}
