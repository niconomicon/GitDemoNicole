package date_array;

public class MyDate {
	public int day;
	public int year;
	public String month;

	public MyDate(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String toString() {
		return month + " " + day + ", " + year;
	}

	public static void main(String[] args) {

		MyDate[] dateArray = new MyDate[4];
		dateArray[0] = new MyDate("May", 16, 1984);
		dateArray[1] = new MyDate("November", 14, 1978);
		dateArray[2] = new MyDate("september", 21, 1980);
		dateArray[3] = new MyDate("July", 3, 1987);

		for (int i=dateArray.length-1;i>=0; i--) {
			System.out.println(dateArray[i]);

		}

	}

}
