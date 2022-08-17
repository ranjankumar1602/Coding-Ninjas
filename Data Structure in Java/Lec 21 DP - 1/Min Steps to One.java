public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        if(n == 1) {
            return 0;
        }
        int option1 = countMinStepsToOne(n - 1);
        int minStep = option1;
        if(n % 3 == 0) {
            int option2 = countMinStepsToOne(n / 3);
            if(option2 < minStep) {
                minStep = option2;
            }
        }
        if(n % 2 == 0) {
            int option3 = countMinStepsToOne(n / 2);
            if(option3 < minStep) {
                minStep = option3;
            }
        }
        return minStep + 1;
	}

}
