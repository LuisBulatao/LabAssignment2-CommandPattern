package Music;

import Command.Command;

public class NextMusic implements Command {
    private MusicController musicController;

    public NextMusic(MusicController musicController){
        this.musicController = musicController;
    }
    @Override
    public String execute() {
        return musicController.NextMusic();
    }
}
