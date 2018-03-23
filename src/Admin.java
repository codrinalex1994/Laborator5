import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public class Admin {

    public List<Command>  myCommand = new ArrayList<>();

  public List<Command> getActiveCommands() {
    List<Command> list = new ArrayList<>();

    // 0 - inactiv, 1 - in pregatire, 2 - pe drum, 3 - finished
    for(Command command : this.myCommand) {
        if(command.getStatus() == 1 || command.getStatus() == 2) {
            list.add(command);
        }
    }

    return list;
  }

  public List<Command> getFinishedCommands() {
      List<Command> list = new ArrayList<>();

      for(Command command : this.myCommand) {
          if(command.getStatus() == 0) {
              list.add(command);
          }
      }

      return list;
  }

}