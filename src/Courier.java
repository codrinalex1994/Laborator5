import java.util.ArrayList;
import java.util.Vector;

public class Courier {

  private ArrayList<String> locatii = new ArrayList<>();

  private String location;

  private Vector  myCommand;

  public String getLocation() {
    return location;
  }

  public void updateLocation(String location) {
    addLocatie(this.location);
    this.location = location;
  }

  public Vector getMyCommand() {
    return myCommand;
  }

  public void setMyCommand(Vector myCommand) {
    this.myCommand = myCommand;
  }

  public ArrayList<String> getCommands() {
    return locatii;
  }

  private void addLocatie(String locatieVeche) {
    locatii.add(locatieVeche);
  }
}