package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer extends Thread {

	public void run() {
		File fichero = new File("/Users/ayoubrehouni/Desktop/numeros.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fichero));
			
			String line=br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
