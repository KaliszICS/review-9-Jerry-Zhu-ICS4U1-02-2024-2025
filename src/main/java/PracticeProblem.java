public class PracticeProblem {

	public static void main(String args[]) {

	}

public static int lettersToFive(String phrase, char c){
	int counter = 0;
	int i = 0;
	while(i < phrase.length()){
		if (c == phrase.charAt(i)){
counter++;
		}
		if(counter == 5){
			return i+1;
		} 
		i++;
	}
	return -1;
}

public static int countLetter(String phrase, char c){
	int counter = 0;
	for (int i = 0; i < phrase.length(); i++){
		if (c == phrase.charAt(i)){
counter++;
		}
	}
	return counter;
}

public static int oddSum(int num, int num2){
	int sum = 0;
	for (int i = Math.min(num , num2); i <= Math.max(num, num2); i++){
		if (i % 2 != 0){
			sum += i;
		}
	}
	return sum;
}
}
