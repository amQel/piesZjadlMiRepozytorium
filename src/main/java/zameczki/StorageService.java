package zameczki;

import java.util.ArrayList;
import java.util.List;

public class StorageService {
	
	private List<Castle> lotsOfCastles = new ArrayList<Castle>();
	
	public void add(Castle person){
		Castle newCastle = new Castle(person.getCastleName(), person.getBuilt(), person.getCastleType(), person.getVisitTime(), person.getCondition(), person.getMaterial());
		lotsOfCastles.add(newCastle);
	}
	
	public List<Castle> getAllCastles(){
		return lotsOfCastles;
	}
	
	public int size()
	{
		return lotsOfCastles.size();
	}

	public void clear(){
    	lotsOfCastles = new ArrayList<Castle>();
    }
}
