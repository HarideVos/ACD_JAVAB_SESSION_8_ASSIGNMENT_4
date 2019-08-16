package eightpointfour;


public class BusTripBookingThread extends Thread{
	String pName;
	int seat;
	int noOfSeats;
	
	public BusTripBookingThread(String pName, int seat, int noOfSeats) {
		this.pName = pName;
		this.seat = seat;
		this.noOfSeats = noOfSeats;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	@Override
	public synchronized void run() {
		System.out.println("Please enter your name: ");
		System.out.println("How many seats do you want?");
		for(int i = 0; i < noOfSeats; i++) {
			System.out.println("Please enter the seat number you want: ");
			System.out.println(pName + ", you booked " + noOfSeats +". The seat numbers you booked are: " + seat + ".");
		}
	}
}
