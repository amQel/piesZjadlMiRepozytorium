package zameczki;

import java.util.ArrayList;
import java.util.List;

public class AllCastlesData {
    private List<Castle> castles = new ArrayList<Castle>();

    public void add(Castle castle) {
        castles.add(castle);
    }
    public void clear(){
    	castles = new ArrayList<Castle>();
    }

    public List<Castle> getAllCastlesData(){
        return castles;
    }
}
