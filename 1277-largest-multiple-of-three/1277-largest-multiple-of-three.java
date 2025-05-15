class Solution {
    public String largestMultipleOfThree(int[] digits) {
    
        if(digits.length == 1){
            if(digits[0] % 3 == 0){
                return Integer.toString(digits[0]);
            }
            else{
                return "";
            }
        }
       
        int remainderOfSum = 0;
        
        int[] counter = new int[10];
        for(int i: digits){
            counter[i]++;
            remainderOfSum = remainderOfSum + i;
        }
        
        int remainderOf1 = counter[1] + counter[4] + counter[7];
        int remainderOf2 = counter[2] + counter[5] + counter[8];

        remainderOfSum = remainderOfSum % 3;
        
        if(remainderOfSum == 1){
            if(remainderOf1 > 0){
                remainderOf1--;
            }
            else{
                remainderOf2 = remainderOf2 - 2;
            }
        }
        if(remainderOfSum == 2){
            if(remainderOf2 > 0){
                remainderOf2--;
            }
            else{
                remainderOf1 = remainderOf1 - 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            if(i % 3 == 0){
                while(counter[i] > 0){
                    sb.append(i);
                    counter[i]--;
                }
            }
            if(i % 3 == 1){
                while(counter[i] > 0 && remainderOf1 > 0){
                    sb.append(i);
                    counter[i]--;
                    remainderOf1--;
                }
            }
            if(i % 3 == 2){
                while(counter[i] > 0 && remainderOf2 > 0){
                    sb.append(i);
                    counter[i]--;
                    remainderOf2--;
                }
            }
        }
        if(sb.length() == 0){
            return "";
        }
        else{
            if(sb.charAt(0) == '0'){
                return "0";
            }
            else{
                return sb.toString();
            }

        }
        
    }
}