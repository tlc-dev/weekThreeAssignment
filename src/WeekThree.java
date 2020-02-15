
public class WeekThree {

	public static void main(String[] args) {
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 90};//Will not print decimals, only whole numbers
		int firstArrayEntry = ages2[0]; 
		int lastArrayEntry = ages2[ages2.length - 1];
		int evaluatedEntry = lastArrayEntry - firstArrayEntry;
		int sum = 0;
		int avg = 0;
		System.out.println("First element minus last " + evaluatedEntry); 
		
		for (int num : ages2) {
			sum += num;
			avg = sum / ages2.length;
		}
		System.out.println("array sum: " + sum);
		System.out.println("age average: " + avg);
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int letterSum = 0;
		int letterAverage = 0;
		//Loop to iterate through array, calc avg number of letters
		for (int i = 0; i < names.length; i++) {
			letterSum += names[i].length();
			letterAverage = letterSum / names.length;
		}
		System.out.println("Average number of letters in name: " + letterAverage);//rounded down
		
		//Loop that concatenates names with spaces on the same line:
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		int[] nameLengths = new int[names.length];
		int nameLengthsSum = 0;
		int nameLengthsAvg = 0;
		
		System.out.println(" ");
		
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(names[i] + ": " + nameLengths[i]);
		}
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i];
			nameLengthsAvg = nameLengthsSum / nameLengths.length;
		} System.out.println("avg name length again: " + nameLengthsAvg);
		
		double[] dblArray = {20.4, 23.56, 56.2, 1.1};
		double[] dblArray2 = {20.4, 23.56, 56.2, 90.1};
		System.out.println(repeatWord("String", 3));
		System.out.println(completeName("Tristan", "Chester"));
		System.out.println("Array sum is greater than 100: " + greaterThanOneHundred(ages2));
		System.out.println("double type array average: " + avgDbl(dblArray));
		System.out.println("Dobule array average is > the second's:  " + dblAvgCompare(dblArray, dblArray2));
		System.out.println(willBuyDrink(true, 10));
		System.out.println("Can you buy this item: " + walletTotalCheck(12, 22));
	}
	
	public static String repeatWord(String word, int multiple) {
		
		String stringOne = word;
		for (int i = 1; i < multiple; i++) {
			word += stringOne;
		}return word;
		//return "String";
		
	}
	
	public static String completeName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
		
	}
	
	public static boolean greaterThanOneHundred(int[] numbers) {
		int arrSum = 0;
		for (int num2 : numbers) {
			arrSum += num2;
			if (arrSum > 100) {
				return true;
			} 
		}
		return false;
	}
	
	public static double avgDbl(double[] nums) {
		double dblSum = 0;
		double dblAverage = 0;
		for (double num3 : nums) {
			dblSum += num3;
			dblAverage = dblSum / nums.length;
		} return dblAverage;
	}
	
	public static boolean dblAvgCompare(double[] array1, double[] array2) {
		double dblSum1 = 0;
		double dblSum2 = 0;
		double dblAverage1 = 0;
		double dblAverage2 = 0;
		for (double dblNum : array1) {
			dblSum1 += dblNum;
			dblAverage1 = dblSum1 / array1.length;
		}
		for (double dblNum2 : array2) {
			dblSum2 = dblNum2;
			dblAverage2 = dblSum2 / array2.length;
		}
		if (dblAverage1 > dblAverage2) {
			return true;
		}
		return false;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
		
	}
	//A problem i have: checking quickly and accurately if an item is affordable:
	public static String walletTotalCheck(int moneyInWallet, int amountDue) {
		if (moneyInWallet >= amountDue) {
			return "yes";
		}
		return "no";
	}
	
	
}
	

