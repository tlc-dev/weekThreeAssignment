
public class WeekThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages = new int[9];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 90;
		
		int firstArrayEntry = ages[0]; 
		int lastArrayEntry = ages[ages.length - 1];
		int evaluatedEntry = firstArrayEntry - lastArrayEntry;
		int sum = 0;
		int avg = 0;
		//System.out.println(firstArrayEntry);
		//System.out.println(lastArrayEntry);
		System.out.println(evaluatedEntry); 
		
		for (int num : ages) {
			sum += num;
			avg = sum / ages.length;
		}
		
		System.out.println(sum);
		System.out.println(avg);
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Loop to iterate through array, calc avg number of letters
		
	}
		
}
