
public class Clock {

	private String name;
	private int hours;
	private int minutes;
	private int seconds;
	private String clock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if(hours >= 0 && hours < 24)
			this.hours = hours;
		else if(hours >= 24)
			this.hours = hours % 24;
		else
			this.hours = 0;
	}

	public int getMinutes() {
		
		return minutes;
	}

	public void setMinutes(int minutes) {
		if(minutes >= 0 && minutes < 60)
			this.minutes = minutes;
		else if(minutes >= 60)
			this.minutes = minutes % 60;
		else
			this.minutes = 0;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if(seconds >= 0 && seconds < 60)
			this.seconds = seconds;
		else if(seconds >= 60)
			this.seconds = seconds % 60;
		else
			this.seconds = 0;
	}

	public String getClock() {
		return clock;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}

	public Clock(Clock c1) {
		// TODO Auto-generated constructor stub
		this.hours = c1.getHours();
		this.minutes = c1.getMinutes();
		this.seconds = c1.getSeconds();
		this.name = c1.getName();
	}

	public Clock(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		
		this.hours = i;
		this.minutes = j;
		this.seconds = k;
		
	}

	public Clock() {
		// TODO Auto-generated constructor stub
		hours = 0;
		minutes = 0;
		seconds = 0;
	
		this.clock = (hours + ":" + minutes + ":" + seconds);
		
	}

	public void incrementHours(int i) {
		// TODO Auto-generated method stub

		this.hours += i;
		
		if(this.hours < 0)
			this.hours += 24;
		else if (this.hours > 24)
			this.hours -= 24;
		
	}

	public void displayTime() {
		// TODO Auto-generated method stub
		System.out.println(name + " ==> " + hours + ":" + minutes + ":" + seconds);
	}

	public void incrementSeconds(int i) {
		// TODO Auto-generated method stub

		this.seconds += i % 60;
		this.minutes += i / 60;
		
	}

	public void incrementMinutes(int i) {
		// TODO Auto-generated method stub
		this.minutes += i % 60;
		this.hours += i / 60;
		
		if(this.hours >= 24)
			this.hours = this.hours % 24;

	}



}
