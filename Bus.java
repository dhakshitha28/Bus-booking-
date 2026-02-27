import java.util.HashMap;
import java.util.Map;

public class Bus {
    Map<Integer,String>place=new HashMap<>();
    private String startingTime;
    private String endingTime;

   public Bus(){
       this.place.put(1,"Chennai");
       this.place.put(2,"Trichy");
       this.place.put(3,"Madurai");
       this.place.put(4,"Coimbatore");
       this.startingTime="9.00";
       this.endingTime="2.30";
   }
    public Map<Integer, String> getPlace() {
        return place;
    }

    public void setPlace(Map<Integer, String> place) {
        this.place = place;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }
}
