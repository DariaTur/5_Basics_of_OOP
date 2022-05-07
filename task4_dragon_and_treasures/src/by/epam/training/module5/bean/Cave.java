package by.epam.training.module5.bean;

import java.util.ArrayList;
import java.util.List;

public class Cave {
	List<Treasure> treasures;
	private String name;
	private Dragon dragon;
	
	public Cave() {
		treasures = new ArrayList<Treasure>();
	}

	public Cave(String name, Dragon dragon) {
		this.name = name;
		this.dragon = dragon;
		treasures = new ArrayList<Treasure>();
	}
	
	public Cave(List<Treasure> treasures, String name, Dragon dragon) {
		this.treasures = treasures;
		this.name = name;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dragon getDragon() {
		return dragon;
	}

	public void setDragon(Dragon dragon) {
		this.dragon = dragon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dragon == null) ? 0 : dragon.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cave other = (Cave) obj;
		if (dragon == null) {
			if (other.dragon != null) {
				return false;
			}
		} else if (!dragon.equals(other.dragon)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (treasures == null) {
			if (other.treasures != null) {
				return false;
			}
		} else if (!treasures.equals(other.treasures)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Cave [treasures=" + treasures + ", name=" + name + ", dragon=" + dragon + "]";
	}

	
}
