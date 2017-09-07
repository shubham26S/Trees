package arrays;
class MaxProductOf3{
  public static void main(String []  args){
    int[] a = {1,0,100};
    MaxProductOf3 m = new MaxProductOf3();
    System.out.println(m.maximumProduct(a));
  }
  public int maximumProduct(int[] nums) {
    int largest = nums[0];
    int largestTwo = 0;
    int largestThree = 0;
    int negMinOne = 0;
    int negMinTwo = 0;
    int negMinThree = 0;
    boolean allNeg = true;

    for(int i = 0 ; i < nums.length; i++){
      if(nums[i] > 0){
        allNeg =false;
        if(nums[i] >= largest){
          largestThree = largestTwo;
          largestTwo = largest;
          largest = nums[i];
        }
        else if(nums[i] <= largest && nums[i] >= largestTwo){
          largestThree = largestTwo;
          largestTwo = nums[i];
        }
        else if(nums[i] <= largest && nums[i] <= largestTwo && nums[i] >= largestThree){
          largestThree = nums[i];
        }
      }
      else if(nums[i] < 0){

        if(nums[i] < negMinOne){
          negMinThree = negMinTwo;
          negMinTwo = negMinOne;
          negMinOne = nums[i];
        }
        else if(nums[i] >= negMinOne && nums[i] < negMinTwo){
          negMinThree = negMinTwo;
          negMinTwo = nums[i];
        }
        else if(nums[i] >= negMinOne && nums[i] >= negMinTwo && nums[i] < negMinThree){
          negMinThree = nums[i];
        }
      }
    }
    int productOne = largest * largestTwo * largestThree;
      int productTwo = 0;
    if(allNeg){
      return  negMinThree * negMinTwo * negMinOne;
    }
    else {
      productTwo = largest * negMinTwo * negMinOne;
    }
    return productOne > productTwo ? productOne : productTwo;

}

}
