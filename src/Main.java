import Light.*;
import Music.*;
import Thermostat.*;
import Tv.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentralHub cb = new CentralHub();

        // Devices
        LightController lightController = new LightController();
        TvController tvController = new TvController();
        ThermostatController thermostatController = new ThermostatController();
        MusicController musicController = new MusicController();


        //TV
        TvSwitchOn TvSwitchOn = new TvSwitchOn(tvController);
        TvSwitchOff TvSwitchOff = new TvSwitchOff(tvController);

        // Light
        LightOff LightOff = new LightOff(lightController);
        LightOn LightOn = new LightOn(lightController);
        DescreaseBrightness DescreaseBrightness = new DescreaseBrightness(lightController);
        IncreaseBrightness IncreaseBrightness = new IncreaseBrightness(lightController);

        //Music
        PlayMusic PlayMusic = new PlayMusic(musicController);
        NextMusic NextMusic = new NextMusic(musicController);
        PreviousMusic PreviousMusic = new PreviousMusic(musicController);

        //Thermostat
        DecreasedTemperature DecreasedTemperature = new DecreasedTemperature(thermostatController);
        IncreasedTemperature IncreasedTemperature = new IncreasedTemperature(thermostatController);


        int selectDevice = 0;
        int selectCommandDevice = 0;


        do {
            System.out.println("\nDevices: ");
            System.out.println("1: Light Device");
            System.out.println("2: Music Device");
            System.out.println("3: Thermostat Device ");
            System.out.println("4: Tv Device");
            System.out.println("5: Turn Off Device");
            System.out.print("Choose Device: ");



            selectDevice = scanner.nextInt();

            if(selectDevice < 1 || selectDevice > 5) continue;
            if(selectDevice == 5) break;

            boolean Stopper = false;
            do {

                switch(selectDevice) {

                    case 1:
                        // Light
                        System.out.println("\nSelect Light Controll: ");
                        System.out.println("1: Switch On");
                        System.out.println("2: Switch Off");
                        System.out.println("3: Increase Brightness");
                        System.out.println("4: Decrease Brightness");
                        System.out.println("5: Turn Off Device");
                        System.out.print("Select control to use: ");


                        selectCommandDevice = scanner.nextInt();
                        if(selectCommandDevice < 1 || selectCommandDevice > 5) continue;

                        switch(selectCommandDevice) {
                            case 1:
                                cb.setCommand(LightOn);
                                cb.executeCommand();
                                break;
                            case 2:
                                cb.setCommand(LightOff);
                                cb.executeCommand();
                                break;
                            case 3:
                                cb.setCommand(DescreaseBrightness);
                                cb.executeCommand();
                                break;
                            case 4:
                                cb.setCommand(IncreaseBrightness);
                                cb.executeCommand();
                                break;
                            case 5:
                                Stopper = true;
                                break;
                        }

                        break;
                    case 2:
                        // Music Controller
                        System.out.println("\nSelect Music Controll: ");
                        System.out.println("1: Play playlist");
                        System.out.println("2: Increase Volume");
                        System.out.println("3: Decrease Volume");
                        System.out.println("4: Turn Off Device");
                        System.out.print("Select control to use");



                        selectCommandDevice = scanner.nextInt();
                        if(selectCommandDevice < 1 || selectCommandDevice > 4) continue;

                        switch(selectCommandDevice){
                            case 1:
                                cb.setCommand(PlayMusic);
                                cb.executeCommand();
                                break;
                            case 2:
                                cb.setCommand(NextMusic);
                                cb.executeCommand();
                                break;
                            case 3:
                                cb.setCommand(PreviousMusic);
                                cb.executeCommand();
                                break;
                            case 4:
                                Stopper = true;
                                break;
                        }

                        break;
                    case 3:
                        //Thermostat Controller
                        System.out.println("\nSelect Thermostat Controll: ");
                        System.out.println(" 1: Increase Temperature");
                        System.out.println(" 2: Decrease Temperature");
                        System.out.println("3: Turn Off Device");
                        System.out.print("Select control to use");

                        selectCommandDevice = scanner.nextInt();
                        if(selectCommandDevice < 1 || selectCommandDevice > 3) continue;

                        switch(selectCommandDevice){
                            case 1:
                                cb.setCommand(DecreasedTemperature);
                                cb.executeCommand();
                                break;
                            case 2:
                                cb.setCommand(IncreasedTemperature);
                                cb.executeCommand();
                                break;
                            case 3:
                                Stopper = true;
                                break;
                        }

                        break;
                    case 4:
                        // TV
                        System.out.println("\nSelect TV Controll: ");
                        System.out.println("1: TV Switch On!");
                        System.out.println("2: TV Switch Off!");
                        System.out.println("3: Turn Off Device");
                        System.out.print("Select control to use");

                        selectCommandDevice = scanner.nextInt();
                        if(selectCommandDevice < 1 || selectCommandDevice > 3) continue;

                        switch(selectCommandDevice){
                            case 1:
                                cb.setCommand(TvSwitchOn);
                                cb.executeCommand();
                                break;
                            case 2:
                                cb.setCommand(TvSwitchOff);
                                cb.executeCommand();
                                break;
                            case 3:
                                Stopper = true;
                                break;
                        }

                        break;
                }
            } while(!Stopper);
        } while(true);

    }
}