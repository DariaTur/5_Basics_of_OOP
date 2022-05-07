package by.epam.training.module5.bean;

public class Treasure {
	private TreasureType type ;
	private int cost;
	
	public Treasure() {};
	
	public Treasure(TreasureType type, int cost) {
		this.type = type;
		this.cost = cost;
	}

	public TreasureType getType() {
		return type;
	}

	public void setType(TreasureType type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override 
	public int hashCode() {
		int result = 1;
		result=31*result + (type == null ? 0 : type.hashCode()) ;
		result=31*result + cost;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj.getClass()!=this.getClass()) {
			return false;
		}
		Treasure tr = (Treasure) obj;
		return this.cost == tr.cost && this.type.equals(tr.type);
	}

	@Override
	public String toString() {
		return "Treasure [type=" + type + ", cost=" + cost + "]";
	}
	
}
