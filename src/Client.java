import java.util.ArrayList;
import java.util.List;

public class Client {
    int id;
    List<Command> commands = new ArrayList<>();


    public Client(int id) {
        this.id = id;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
    public String getStatus(Command command) {
        return command.getStatusName();
    }
}
