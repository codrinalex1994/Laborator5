public class Main {
    public static void main(String[] args) {
        Admin administrator = new Admin();
        Command c1 = new Command();
        Command c2 = new Command();
        administrator.addCommand(c1);
        administrator.addCommand(c2);
        System.out.println(administrator.getActiveCommands());
        System.out.println(administrator.getFinishedCommands());
    }
}
