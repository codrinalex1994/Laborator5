import java.util.List;
import java.util.ArrayList;

public class Admin {

    public List<Command>  myCommand = new ArrayList<>();

    public String getActiveCommands() {
        List<Integer> list = new ArrayList<>();

        // 0 - inactiv, 1 - in pregatire, 2 - pe drum, 3 - finished
        for(Command command : this.myCommand) {
            if(command.getStatus() == 1 || command.getStatus() == 2) {
                list.add(command.getId());
            }
        }

        return list.toString();
    }

    public String getFinishedCommands() {
        List<Integer> list = new ArrayList<>();

        for(Command command : this.myCommand) {
            if(command.getStatus() == 3) {
                list.add(command.getId());
            }
        }

        return list.toString();
    }

    public void addCommand(Command command) {
        this.myCommand.add(command);
    }

}
