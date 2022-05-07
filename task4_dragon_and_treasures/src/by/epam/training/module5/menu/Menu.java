package by.epam.training.module5.menu;

import java.util.Scanner;

import by.epam.training.module5.bean.Cave;
import by.epam.training.module5.logic.CaveLogic;

public class Menu {
	private static final Menu instance = new Menu();
	private final CaveLogic logic = CaveLogic.getInstance();
	
	private Menu() {};
	
	public static Menu getInstance() {
		return instance;
	}
	
	public void runMenu(Cave cave) {
		logic.fillCave(cave);
		System.out.println("1. View all treasures" +"\n"
						 + "2. Show the most valuable treasure "+"\n"
						 + "3. Select treasures for a given amount"+"\n"
						 + "4. Exit"+"\n");
		System.out.println("Enter a number from 1 to 4: ");
		while(true) {
			int number = enterNumber();
			switch(number) {
				case 1: System.out.println(logic.treasuresToString(cave.getTreasures()));
						break;
				case 2:System.out.println(logic.getMostExpensiveTreasure(cave));
						break;
				case 3: int sum = enterSum();
						System.out.println(logic.treasuresToString(logic.getTreasuresForAmount(cave, sum)));
						System.out.println("Total amount: "+logic.sum(logic.getTreasuresForAmount(cave, sum)));
						break;
			}
			if(number == 4) {
				break;
			}
		}
	}
	
	public int enterSum() {
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid value, please try again");
			System.out.print(">>");
		}
		sum = sc.nextInt();
		return sum;
	}
	
	public int enterNumber() {
		int number = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid value, please try again");
			System.out.print(">>");
		}
		number = sc.nextInt();
		return number;
	}
}
