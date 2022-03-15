package chap07.lecture.p01inheritance;

public class App01 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.cpu = "펜티엄";
		com1.ram = "32g";
		com1.ssd = "1tb";
		com1.executeGame();
		
		QuantumComputer qc = new QuantumComputer();
		qc.cpu = "intel";
		qc.ram = "64g";
		qc.ssd = "4tb";
		qc.executeGame();
		qc.executeQuantum();
	}
}
