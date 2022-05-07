package by.epam.training.module5.bean;

public enum TreasureType {
	COIN("Coin"), JEWELLERY("Jewellery"), GEM("Gem"), GOLD("Gold"), SILVER("Silver");
	
	private String type;
	
	TreasureType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return type;
	}
}
