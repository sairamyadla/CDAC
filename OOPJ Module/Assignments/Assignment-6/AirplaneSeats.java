package Assignment6;

public class AirplaneSeats {
	private boolean[][] seats;
	
	public AirplaneSeats(int rows, int cols) {
		seats = new boolean[rows][cols]; 
	}
	public void bookSeat(int row, int col) {
		if (seats[row][col]) {
			System.out.println("Seat is already booked.");
	}
		else {
		seats[row][col] = true;
		System.out.println("Seat booked successfully.");
		}
	}
	public void cancelBooking(int row, int col) {
		if (seats[row][col]) {
			seats[row][col] = false;
			System.out.println("Booking cancelled.");
	} 
		else {
			System.out.println("Seat is not booked.");
		}
	}
		public void checkSeat(int row, int col) {
			if (seats[row][col]) {
				System.out.println("Seat is occupied.");
			} 
			else {
				System.out.println("Seat is available.");
			}
		}
		public void displaySeats() {
			System.out.println("Seating arrangement:");
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {
					System.out.print(seats[i][j] ? "X " : "O ");
				}
				System.out.println();
			}
	}
	public static void main(String[] args) {
	AirplaneSeats airplane = new AirplaneSeats(3, 3);
	airplane.bookSeat(1, 1);
	airplane.cancelBooking(1, 1);
	airplane.checkSeat(1, 1);
	airplane.displaySeats();
	}
	}