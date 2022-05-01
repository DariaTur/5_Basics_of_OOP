package by.epam.training.module5;
/*
 * Задача 3. 
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о 
 * выходных и праздничных днях.
 */
public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		View view = View.getInstance();
		
		Calendar.Day day1 = calendar.new Day("12 марта 2022", false, false);
		Calendar.Day day2 = calendar.new Day("3 июня 2022", false, false);
		Calendar.Day day3 = calendar.new Day("1 января 2022", true, true);
		Calendar.Day day4 = calendar.new Day("30 апреля 2022", true, false);
		Calendar.Day day5 = calendar.new Day("14 января 2022", false, true);
		Calendar.Day day6 = calendar.new Day("9 апреля 2022", true, false);
		
		calendar.addDay(day1);
		calendar.addDay(day2);
		calendar.addDay(day3);
		calendar.addDay(day4);
		calendar.addDay(day5);
		calendar.addDay(day6);
		
		view.showCalendar(calendar);
		view.showAmountOfDaysOff(calendar);
		view.showAmountOfHolidays(calendar);
		
		calendar.removeDay(day4);
		view.showCalendar(calendar);	
		
	}

}
