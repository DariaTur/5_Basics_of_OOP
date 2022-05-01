package by.epam.training.module5;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance == null) {
			instance = new View();
		}
		return instance;
	}
	
	public void showCalendar(Calendar calendar) {
		System.out.print("Даты: ");
		for(Calendar.Day day : calendar.getDays()) {
			System.out.println(day.getDay() + (day.isHoliday()? "(праздник)" : "")+(day.isDayOff()? "(выходной)" : "(будний)"));
		}
		System.out.println();
	}
	
	public void showAmountOfDaysOff(Calendar calendar) {
		System.out.println("Количество выходных дней: "+calendar.countDaysOff());
		System.out.println();
	}
	
	public void showAmountOfHolidays(Calendar calendar) {
		System.out.println("Количество праздников: "+calendar.countHolidays());
		System.out.println();
	}
}
