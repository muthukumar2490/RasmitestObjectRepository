package testObjectRepository;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class testXMLfile {

	public static void main(String[] args) throws DocumentException {

		String path = "C:\\Users\\KANNA\\eclipse-workspace\\testObjectRepository\\src\\obj_repo.xml";
		File inputFile = new File(path);

		System.out.println(System.getProperty("user.dir"));

		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(inputFile);
		
		try {
			String xmlbrowser = document.selectSingleNode("//menu/xmlbrowser").getText();
			System.out.println(xmlbrowser);
		} catch (NullPointerException e) {

			e.printStackTrace();
		}

		String xmlurl = document.selectSingleNode("//properties/xmlurl").getText();

		System.out.println(xmlurl);
		System.out.println(xmlurl);
	}

}
