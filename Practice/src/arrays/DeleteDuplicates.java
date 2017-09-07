class DeleteDuplicates{
  public static void main(String [] args){

  }
  public int removeElement(int[] nums, int val) {
    if(nums.length < 2){
      return nums.length;
    }
    int p = 0;
    for(int i = 0 ; i < nums.length; i++){
      if(nums[i] != val){
        nums[p] = nums[i];
        p++;
      }
    }
    return p;
  }

public int remove(int[] nums, int val){
  int a= 0;
  int n = nums.length;
  while(a < n){
    if(nums[a] == val){
      nums[a] = nums[n-1];
      n--;
    }
    else{
      a++;
    }
  }
  return n;
}

}
