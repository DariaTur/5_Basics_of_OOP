package by.epam.training.module5.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.training.module5.bean.Treasure;
import by.epam.training.module5.bean.TreasureType;
import by.epam.training.module5.dao.TreasureDao;

public class TreasureDaoImpl implements TreasureDao{
	private static final TreasureDaoImpl instance = new TreasureDaoImpl();
	
	private TreasureDaoImpl() {};
	
	public static TreasureDaoImpl getInstance() {
		return instance;
	}
	
	@Override
	public List<Treasure> getTreasures(){
		List<Treasure> treasures = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("/Users/mac/workspace/basics-of-oop/task4_dragon_and_treasures/src/by/epam/training/module5/source/treasures.txt"))){
			String line = null;
			while((line=br.readLine())!=null) {
				Treasure treasure = null;
				String[] result = line.split(" ");
				if(result[1].substring(0, result[1].length()-1).equalsIgnoreCase("Coin")) {
					
					treasure = new Treasure(TreasureType.COIN, Integer.parseInt(result[3]));
					
				} else if(result[1].substring(0, result[1].length()-1).equalsIgnoreCase("Gem")){
					
					treasure = new Treasure(TreasureType.GEM, Integer.parseInt(result[3]));
					
				} else if(result[1].substring(0, result[1].length()-1).equalsIgnoreCase("Jewellery")){
					
					treasure = new Treasure(TreasureType.JEWELLERY, Integer.parseInt(result[3]));
					
				} else if(result[1].substring(0, result[1].length()-1).equalsIgnoreCase("Gold")){
					
					treasure = new Treasure(TreasureType.GOLD, Integer.parseInt(result[3]));
					
				} else if(result[1].substring(0, result[1].length()-1).equalsIgnoreCase("Silver")){
					
					treasure = new Treasure(TreasureType.SILVER, Integer.parseInt(result[3]));
				}
				
				treasures.add(treasure);
			}
		} catch(FileNotFoundException e) {
			e.getMessage();
		} catch(IOException e) {
			e.getMessage();
		} 
		
		return treasures;
	}
	
}
