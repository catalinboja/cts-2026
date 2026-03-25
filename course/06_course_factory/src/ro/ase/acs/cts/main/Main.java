package ro.ase.acs.cts.main;

import ro.ase.acs.cts.design.patterns.factory.method.DocFactory;
import ro.ase.acs.cts.design.patterns.simple.factory.DocSimpleFactory;
import ro.ase.acs.cts.documents.AbstractDocument;
import ro.ase.acs.cts.documents.DocType;
import ro.ase.acs.cts.documents.DocumentHtmlGeneric;
import ro.ase.acs.cts.documents.DocumentOpenOfficeText;
import ro.ase.acs.cts.documents.DocumentWordText;

public class Main {
	public static void main(String[] args) {
		
		//the solution depends on all the details specific to 
		//	different constructors/classes details
		
		//tight coupling - opposite of DIP
		
//		// create a html doc
//		AbstractDocument htmlDoc = 
//				new DocumentHtmlGeneric("index.html", true);
//		// create a word doc
//		AbstractDocument wordDoc = 
//				new DocumentWordText("subject.docx", 22, false);
//		AbstractDocument openOffice = 
//				new DocumentOpenOfficeText("course.odt", true);
		
		
		//loose coupling - DIP
		AbstractDocument htmlDoc = DocSimpleFactory.getDocument(
				DocType.HTML, "robots.txt");
		AbstractDocument wordDoc = DocSimpleFactory.getDocument(
				DocType.WORD, "content.docx");
		AbstractDocument openOffice = DocSimpleFactory.getDocument(
				DocType.OPEN_OFFICE, "subject.odt");
		
		
		((DocumentHtmlGeneric)htmlDoc).setHeader();
		
		
		AbstractDocument openOffice2 = 
				new DocumentOpenOfficeText("course.odt", true, "");
	}
}




