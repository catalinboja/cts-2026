package ro.ase.acs.cts.design.patterns.adapter.objects;

import java.util.ArrayList;

import ro.ase.acs.cts.printer.InkPrinter;
import ro.ase.acs.cts.printer.InkPrinterInterface;
import ro.ase.acs.cts.printer.laser.LaserPinter;
import ro.ase.acs.cts.printer.laser.LaserPrinterInterface;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<InkPrinterInterface> printers = new ArrayList<>();
		printers.add(new InkPrinter());
		printers.add(new InkPrinter());
		
		InkPrinterInterface currentPrinter = printers.get(0);
		currentPrinter.print("Hello");
		
		LaserPrinterInterface laserPrinter = 
				new LaserPinter();
		
		//InkPrinterInterface inkPrinter = laserPrinter;
		
		InkPrinterInterface laserPrinterAdapter = 
				new Laser2InkPrinterAdapter(laserPrinter);
		laserPrinterAdapter.print("Hello !");
		
		printers.add(laserPrinterAdapter);
		currentPrinter = printers.get(2);
		currentPrinter.print("Hello");
		
	}

}
