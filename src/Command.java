public class Command {

    private static int count=0;
    private int id;

    // 0 - inactiv, 1 - in pregatire, 2 - pe drum, 3 - finished
    private int status;
    private Courier courier = new Courier();

    public Command() {
        this.id = count++;
        this.status = 0;
    }

    public int getStatus() {
        return this.status;
    }
    public String getStatusName() {
        switch(status){
            case 0:
                return "inactive";
            case 1:
                return "in progress";
            case 2:
                return "in delivery";
            case 3:
                return "delivered";
            default:
                return "unknown";
        }
    }

    public int getId() {
        return id;
    }

    public String getLocation(){
        return courier.getLocation();
    }

}