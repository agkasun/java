import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Store {

	public static void main(String args[]) {
		String[] pump1 = new String[]{"Nimal", "Champika", "Pathum", "Arjuna", "Mihiranga", "Janaka"};
		String[] pump2 = new String[]{"Susantha", "Kalum", "Chandana", "Vimalasooriya", "Empty", "Empty"};
		String[] pump3 = new String[]{"Harsana", "Suminda", "Nalaka", "Empty", "Empty", "Empty"};

		storeArray(pump1,"pump1.txt");
		//String[] load;
		pump1 = loadArray("pump1.txt");

		for(int m=0;m<load.length;m++){
			System.out.println(load[m]);
		}
	}

	public static void storeArray(String[] arr,String fileName){
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i].toString());
				writer.newLine();
			}
			writer.flush();
			System.out.println("Data Entered in to the file successfully");
		}catch (Exception ex){
			System.out.println("Data Save Fail !");
		}

	}

	public static String[] loadArray(String fileName){
		String[] out = new String[6];
		try {
			BufferedReader reader = new BufferedReader (new FileReader(fileName));
			String line ="";

			int count = 0;
			while ((line = reader.readLine()) != null) {
				out[count]=line;
				count++;
			}
			reader.close();
			System.out.println("Data Load Success !");
			return out;
		}catch (Exception ex){
			System.out.println("Data Load Fail !");
			return out;
		}

	}

}