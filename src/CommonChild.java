import java.util.Scanner;


public class CommonChild {

	public static void main(String[] args) {
		DuplicateMap<Character, Integer> hmap = new DuplicateMap<>();
		Scanner obj = new Scanner(System.in);
		String first = obj.nextLine();
		String second = obj.nextLine();
		int NumOfCommonString =0;
		// map each character of the first string to a boolean value
		for(int i =0; i<first.length(); i++){
			hmap.put(first.charAt(i), 0);
		}
		
		for(int k =0; k<second.length(); k++){
			if((hmap.set(second.charAt(k), 1))){
				NumOfCommonString++;
			}
		}
		
		System.out.println("Testing");	
		
//		for (char i: hmap.keySet()){
//			System.out.println("key: " + i + " value: " + hmap.get(i) + " ");
//		}
//		
	}

}
