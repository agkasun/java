public class Sort {

	public static void main(String args[]) {
		String[] pump1 = new String[]{"Nimal", "Champika", "Pathum", "Arjuna", "Mihiranga", "Janaka"};
		String[] pump2 = new String[]{"Susantha", "Kalum", "Chandana", "Vimalasooriya", "Empty", "Empty"};
		String[] pump3 = new String[]{"Harsana", "Suminda", "Nalaka", "Empty", "Empty", "Empty"};

		String[] sorted;
		sorted = SortStringArray(pump1);

		for(int i = 0; i<sorted.length;i++){
			System.out.println(sorted[i]);
		}
	}

	public static String[] SortStringArray(String arr[]){
		String tmp = ""; //For temporary element value save

		for(int i=0 ; i<arr.length;i++){
			if(arr[i] == "Empty"){ // Check Element Value is Empty and It's true exit loop
				break;
			}
			for(int x =i+1; x < arr.length;x++){
				if(arr[x] == "Empty"){ // Check Element Value is Empty and It's true exit loop
					break;
				}
				if(arr[i].compareTo(arr[x]) > 0){
					tmp  =  arr[i]; // store element i value to tmp
					arr[i] = arr[x]; // change element i value with second element x value
					arr[x] = tmp; // change second element x value with tmp
				}

			}
		}

		return arr;
	}


    
}