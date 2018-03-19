package helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Model implements IModel {

	@Override
	public String getMessage() {
		Scanner sc = null;
		String r = "";
		try {
			sc = new Scanner(new File(Model.class.getResource("message.txt").getFile()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()){
			r += sc.nextLine();
		}
		return r;
	}

}
