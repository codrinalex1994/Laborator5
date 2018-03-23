import java.util.ArrayList;

public class Courier {

  private ArrayList<String> locatii = new ArrayList<>();

  private String location = new String("");

  public String getLocation() {
    return location;
  }

  public void updateLocation(String location) {
     // if(!this.location.equals(""))
        addLocatie(location);
    this.location = location;
  }

  public String getHistoryLocations() {
      StringBuilder sb = new StringBuilder();
      sb.append("History : \n");
      for(String s : locatii){
          sb.append(s);
          sb.append(", ");
      }
      sb.setLength(sb.length()-2);
    return sb.toString();
  }

  private void addLocatie(String locatieVeche) {
    locatii.add(locatieVeche);
  }
}