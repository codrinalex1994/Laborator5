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

  public String getHistoryLocations() {
      StringBuilder sb = new StringBuilder();
      for(String s : locatii){
          sb.append(s);
          sb.append(" , ");
      }
    return sb.toString();
  }

  private void addLocatie(String locatieVeche) {
    locatii.add(locatieVeche);
  }
}