class Solution {

    public int whileLoop(int d) {

        int count = 0;
        int sum = 0;
        int num = 1;

        while(d > 0){

            if(num % 10 == d){

                sum = sum + num;
                count++;

                if(count >= 50){
                    break;
                }
            }

            num++;
        }

        return sum;
    }
}