package o_oops.delegation;

import java.util.logging.Logger;

interface Printer {
	void print(final String message);
}

class CanonPrinter implements Printer {

	private static final Logger LOGGER = Logger.getLogger(CanonPrinter.class.getName());

	@Override
	public void print(String message) {
		LOGGER.info("Canon Printer : {} " + message);
	}
}

class EpsonPrinter implements Printer {

	private static final Logger LOGGER = Logger.getLogger(EpsonPrinter.class.getName());

	@Override
	public void print(String message) {
		LOGGER.info("Epson Printer : {} " + message);
	}
}

class HpPrinter implements Printer {

	private static final Logger LOGGER = Logger.getLogger(HpPrinter.class.getName());

	@Override
	public void print(String message) {
		LOGGER.info("HP Printer : {} " + message);
	}
}

class PrinterController implements Printer {

	private final Printer printer;

	public PrinterController(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print(String message) {
		printer.print(message);
	}
}

public class DelegationDemo1 {

	public static final String MESSAGE_TO_PRINT = "hello world";

	public static void main(String[] args) {
		PrinterController hpPrinterController = new PrinterController(new HpPrinter());
		PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
		PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

		hpPrinterController.print(MESSAGE_TO_PRINT);
		canonPrinterController.print(MESSAGE_TO_PRINT);
		epsonPrinterController.print(MESSAGE_TO_PRINT);
	}

}
