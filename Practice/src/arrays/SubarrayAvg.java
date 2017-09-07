package arrays;
class SubarrayAvg{
  public double findMaxAverage(int[] nums, int k) {
    double avg = 0.0;
    double maxSum = 0.0;
    double sum = 0.0;
    for(int i = 0 ; i < k ;i++){
      sum += nums[i];
    }
    maxSum = sum;
    for(int i = k ; i < nums.length; i++){
      sum = sum + nums[i] - nums[i-k];
      maxSum  = maxSum > sum ? maxSum : sum;
    }
    avg = maxSum / k ;
    return avg;
   }
   public static void main(String [] args){
     SubarrayAvg s = new SubarrayAvg();
     int[] arr = {0,4,0,3,2};
     System.out.println(s.findMaxAverage(arr,1));
   }
}
