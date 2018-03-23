public class Main {
    public static void main(String[] args) {
        Admin administrator = new Admin();
        Courier courier = new Courier();


        Command c1 = new Command(courier,1);
        Command c2 = new Command(courier,2);

        administrator.addCommand(c1);
        administrator.addCommand(c2);


        courier.updateLocation("Bacau");
        courier.updateLocation("Iasi");
        c1.setStatus(2);
        c2.setStatus(2);
        System.out.println("Comenzi active : " + administrator.getActiveCommands());
        System.out.println(c1.getLocation());
        c1.setStatus(3);
        courier.updateLocation("Botosani");
        System.out.println(c2.getLocation());

        System.out.println(courier.getHistoryLocations());
        System.out.println("Comenzi active : " + administrator.getActiveCommands());
        System.out.println("Comenzi finalizate : " + administrator.getFinishedCommands());
    }
}
