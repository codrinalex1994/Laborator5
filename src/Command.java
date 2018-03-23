public class Command {

    private static int count=0;
    private int id;
    private int status;

    public Command() {
        this.id = count++;
        this.status = 0;
    }

    public int getStatus() {
        return this.status;
    }

    public int getId() {
        return id;
    }
}