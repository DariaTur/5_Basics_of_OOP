package by.epam.training.module5.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.training.module5.bean.Cave;
import by.epam.training.module5.bean.Treasure;
import by.epam.training.module5.dao.TreasureDao;
import by.epam.training.module5.dao.impl.TreasureDaoImpl;

public class CaveLogic {
	private static final CaveLogic instance = new CaveLogic();
	
	private TreasureDao dao = TreasureDaoImpl.getInstance();
	
	private CaveLogic() {};
	
	public static CaveLogic getInstance() {
		return instance;
	}
	
	public void fillCave(Cave cave) {
		cave.setTreasures(dao.getTreasures());
	}
	
	public Treasure getMostExpensiveTreasure(Cave cave) {
		Treasure treasure = cave.getTreasures().get(0);
		for(int i = 1; i<100; i++) {
			if(cave.getTreasures().get(i).getCost()>treasure.getCost()) {
				treasure = cave.getTreasures().get(i);
			}
		}
		return treasure;
	}
	
	public List<Treasure> getTreasuresForAmount(Cave cave, int sum){
		List<Treasure> result = new ArrayList<>();
		for(int i = 0; i<100; i++) {
			if(sum-cave.getTreasures().get(i).getCost()>=0) {
				sum = sum-cave.getTreasures().get(i).getCost();
				result.add(cave.getTreasures().get(i));
			}
		}
		return result;
	}
	
	public int sum(List<Treasure> treasures) {
		int res = 0;
		for(Treasure tr: treasures) {
			res+=tr.getCost();
		}
		return res;
	}
	
	public String treasuresToString(List<Treasure> treasures) {
		String res = "";
		for(Treasure tr: treasures) {
			res+="Type: "+ tr.getType().toString().toLowerCase()+", cost: " +tr.getCost()+"\n";
		}
		return res;
	}

}
