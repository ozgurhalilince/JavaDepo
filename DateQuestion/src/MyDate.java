
public class MyDate {

	int year, month, day;
	String date;
	String monthString;

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 1899 && year < 2014)
			this.year = year;
		else 
			this.year = -1;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12)
			this.month = month;
		else
			this.month = -1;
	}

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 1 && day <=31)
			this.day = day;
		else
			this.day = -1;
	}

	public String getDate(){
		if (month == -1)
			return "fatal";
		else if(month == 1)
			monthString = "Ocak";
		else if (month == 2)
			monthString = "Subat";
		else if (month == 3)
			monthString = "Mart";
		else if (month == 4)
			monthString = "Nisan";
		else if (month == 5)
			monthString = "Mayıs";
		else if (month == 6)
			monthString = "Haziran";
		else if (month == 7)
			monthString = "Temmuz";
		else if (month == 8)
			monthString = "Ağustos";
		else if (month == 9)
			monthString = "Eylül";
		else if (month == 10)
			monthString = "Ekim";
		else if (month == 11)
			monthString = "Kasım";
		else if (month == 12)
			monthString = "Aralık";
		if(day == -1)
			return "fatal";
		if(year == -1)
			return "fatal";

		date = (day + " " + monthString + " " + year);
		return date;
	}

	public boolean isBigger(MyDate date){

		if(this.year > date.year)
			return true;
		if(this.year == date.year)
			if(this.month > date.month)
				return true;
		if(this.year == date.year)
			if(this.month == date.month)
				if(this.day > date.day)
					return true;
		
		return false;
	}


}
