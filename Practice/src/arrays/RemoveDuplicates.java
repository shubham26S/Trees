class RemoveDuplicates{
    public static void main(String [] args){
      int[] arr = {1,1,2};
      RemoveDuplicates d= new RemoveDuplicates();
      System.out.println(d.removeDuplicates(arr));
    }
    public int removeDuplicates(int[] nums){
      // if(nums.length == 0 || nums.length == 1){
      //   return nums.length;
      // }
      // int prev = nums[0];
      // int current = nums[0];
      // int count = 1;
      // for(int i = 1; i < nums.length; i++){
      //   current = nums[i];
      //   if(current != prev){
      //     prev = current;
      //     count++;
      //   }
      //   else{
      //     continue;
      //   }
      // }
      // return count;
      int size = nums.length;
      if(size < 2){
        return size;
      }
      int id = 1;
      for(int i = 1; i < size; i++){
        if(nums[i] != nums[i-1]){
          nums[id++] = nums[i];
        }
      }
      return id;

    }
}
