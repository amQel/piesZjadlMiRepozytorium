package zameczki;

import java.io.Serializable;


public class Castle implements Serializable{

	private String castleName;
	private int builtDate;
	private String castleType;
	private boolean visitable;
	private String condition;
	
	public Castle() {
		super();
	}

	public String getCastleName() {
		return castleName;
	}

	public void setCastleName(String castleName) {
		this.castleName = castleName;
	}

	public int getBuiltDate() {
		return builtDate;
	}

	public void setBuiltDate(int builtDate) {
		this.builtDate = builtDate;
	}

	public String getCastleType() {
		return castleType;
	}

	public void setCastleType(String castleType) {
		this.castleType = castleType;
	}

	public boolean isVisitable() {
		return visitable;
	}

	public void setVisitable(boolean visitable) {
		this.visitable = visitable;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
		