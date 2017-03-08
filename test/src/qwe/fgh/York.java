package qwe.fgh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class York extends Dog {

	int i;
	@Override
	public void run() {
		
		super.run();
	}

	@Override
	public String voice(String say) {
		
		return super.voice(say);
	}
	
	public int testic() throws NumberFormatException, IOException{
	
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("INPUT");
		int sch = Integer.parseInt(br.readLine());
		return sch;
	
	
	
	}
}
