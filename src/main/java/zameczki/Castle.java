package zameczki;

public class Castle {
	
	private String castleName = "unknown";
	private int built = 1000;
	private String castleType = "";
	private String visitTime = "";
	private String condition = "semi destroyed castle";
	private String material = "brick";
	
	
	public Castle() {
		super();
	}


	public Castle(String castleName, int built, String castleType,
			String visitTime, String condition, String material) {
		super();
		this.castleName = castleName;
		this.built = built;
		this.castleType = castleType;
		this.visitTime = visitTime;
		this.condition = condition;
		this.material = material;
	}


	public String getCastleName() {
		return castleName;
	}


	public void setCastleName(String castleName) {
		this.castleName = castleName;
	}


	public int getBuilt() {
		return built;
	}


	public void setBuilt(int built) {
		this.built = built;
	}


	public String getCastleType() {
		return castleType;
	}


	public void setCastleType(String castleType) {
		this.castleType = castleType;
	}


	public String getVisitTime() {
		return visitTime;
	}


	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
}
