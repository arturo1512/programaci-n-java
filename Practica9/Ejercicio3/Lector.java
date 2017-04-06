import java.io.*;

public class Lector {
	private String dato = "";
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public String leeString() {
		try{
			this.dato = br.readLine();
		} catch(IOException e) {
		}

		return this.dato;
	}


	
}