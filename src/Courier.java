import java.util.ArrayList;

public class Courier {

  private ArrayList<String> locatii = new ArrayList<>();

  private String location;

  public String getLocation() {
    return location;
  }

  public void updateLocation(String location) {
    addLocatie(this.location);
    this.location = location;
  }

  public ArrayList<String> getCommands() {
    return locatii;
  }

  private void addLocatie(String locatieVeche) {
    locatii.add(locatieVeche);
  }
}