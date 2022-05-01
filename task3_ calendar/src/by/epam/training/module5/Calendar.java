package by.epam.training.module5;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<Day> days;
	
	public Calendar() {
		days = new ArrayList<Day>();
	};
	
	public Calendar(List<Day> days) {
		this.days = days;
	}

	public void addDay(Day day) {
		days.add(day);
	}
	
	public void removeDay(Day day) {
		days.remove(day);
	}
	
	public int countDaysOff() {
		int result = 0;
		for(Day day: days) {
			if(day.isDayOff) {
				result++;
			}
		}
		return result;
	}
	
	public int countHolidays() {
		int result = 0;
		for(Day day: days) {
			if(day.isHoliday) {
				result++;
			}
		}
		return result;
	}
	
	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
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
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null) {
				return false;
			}
		} else if (!days.equals(other.days)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [days=" + days + "]";
	}

	public class Day {
		private String day;
		private boolean isDayOff;
		private boolean isHoliday;
		
		public Day() {};
		
		public Day(String day, boolean isDayOff, boolean isHoliday) {
			this.day = day;
			this.isDayOff = isDayOff;
			this.isHoliday = isHoliday;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public boolean isDayOff() {
			return isDayOff;
		}

		public void setDayOff(boolean isDayOff) {
			this.isDayOff = isDayOff;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((day == null) ? 0 : day.hashCode());
			result = prime * result + (isDayOff ? 1231 : 1237);
			result = prime * result + (isHoliday ? 1231 : 1237);
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
			Day other = (Day) obj;
			
			if (day == null) {
				if (other.day != null) {
					return false;
				}
			} else if (!day.equals(other.day)) {
				return false;
			}
			if (isDayOff != other.isDayOff) {
				return false;
			}
			if (isHoliday != other.isHoliday) {
				return false;
			}
			return true;
		}

	}
}
