package udemy.devsuperior.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	// Método para calcular a data em milissegundos
	public long duration() {

		long differenceDays = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(differenceDays, TimeUnit.MILLISECONDS); // Converte milisseconds para days

	}

	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();

		if (checkIn.before(this.checkIn) || checkOut.before(this.checkOut)) {
			return "Reservation dates for update must be in the future.";
		}
		
		if (!checkOut.after(checkIn)) {
			return "Check-out date must be after check-in date.";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;
	}

	@Override
	public String toString() {

		return "Room " 
		       + getRoomNumber() 
		       + " - check-in: " 
		       + sdf.format(getCheckIn()) 
		       + ", check-out: "
			   + sdf.format(getCheckOut()) 
			   + " - " + duration() 
			   + " night(s)";

	}

}
