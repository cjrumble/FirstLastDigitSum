// add the first and last digits of the given positive number. e.g. 232, add 2 + 2. 5, add 5 + 5. 13, add 1 + 3

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
            if (number<0){
                return -1;
            }
            int sum = number%10; // assigns last number to sum
            while(number>=10){ // check if number is >= 2-digits, divide to get single digit
                number/=10;
            }
            return sum+number; // last least significant number + most significant 1st number
    }
}
