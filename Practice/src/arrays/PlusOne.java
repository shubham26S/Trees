class PlusOne{
    public static void main(String[] args){
      PlusOne p = new PlusOne();
      int[] arr = {9,8,7,6,5,4,3,2,1,0};
      int[] a = p.plusOne(arr);
      for(int k : a){
        System.out.println(k);
      }
    }
    public int[] plusOne(int[] digits) {
      boolean allNine = true;
      for(int i = 0 ; i < digits.length; i++){
        if(digits[i] != 9){
          allNine = false;
          break;
        }
      }
      if(!allNine){
        for(int i = digits.length - 1; i >= 0 ; i --){
          if(digits[i] < 9){
            digits[i]++;
            return digits;
          }
            digits[i] = 0;
      }
    }
      else{
        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        return arr;
      }
      return digits;
    }
}
