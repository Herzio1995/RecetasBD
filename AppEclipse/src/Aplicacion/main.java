package Aplicacion;

import java.time.LocalDate;

public class main {
	public static void main(String[] args) {
		conector cx = new conector();
		cx.conectar();
		universalUIController.main(args);
	}

	private static void sendReview() {
		LocalDate n = LocalDate.now();
	}
	
	private static boolean inTime() {
		return true;
	}
}
