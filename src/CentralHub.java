import Command.Command;
public class CentralHub {
        private Command command;

        public CentralHub() {
        }

        public CentralHub(Command command) {
            this.command = command;
        }

        public Command getCommand() {
            return command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

        public void executeCommand() {
            this.command.execute();
        }
    }