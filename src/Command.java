import java.util.ArrayList;

public class Command {

    private int id;

    // 0 - inactiv, 1 - in progress, 2 - in delivery, 3 - delivered
    private int status;
    private String[] statusName= new String[4];
    private Courier courier;

    public Command(Courier c, int id) {
        this.id = id;
        this.status = 0;
        this.courier=c;
        statusName[0]="inactive";
        statusName[1]="in progress";
        statusName[2]="in delivery";
        statusName[3]="delivered";
    }

    public int getStatus() {
        return this.status;
    }
    public String getStatusName() {
        return statusName[status];
    }

    public int getId() {
        return id;
    }

    public String getLocation(){
        return courier.getLocation();
    }

    public void setStatus(int status) {
        this.status = status;
    }
}