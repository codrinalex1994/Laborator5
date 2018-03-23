public class Command {

    private int id;
    private int status;

    public Command(Integer id) {
        this.id = id;
        this.status = 0;
    }

    public int getStatus() {
        return this.status;
    }

    public int getId() {
        return id;
    }
}