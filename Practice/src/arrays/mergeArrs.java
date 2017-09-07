class mergeArrs{
  public static void main(String [] args){
    int[] a = {1,2,5,7,9,12};
    int[] b = {4,5,7,8,10,11};
    mergeArrs m = new mergeArrs();
    int [] k = m.merge(a,6,b,6);
    for(int i : k){
      System.out.println(i);
    }
  }
  public int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int i = 0, j = 0;
    int[] arr = new int[m+n];
    int k = 0;
    while(i < m && j < n){
      if(nums1[i] <= nums2[j]){
        arr[k] = nums1[i];
        i++;
      }
      else{
        arr[k] = nums2[j];
        j++;
      }
      k++;
    }
    while(i < m){
      arr[k] = nums1[i];
      i++;
      k++;
    }
    while(j < n){
      arr[k] = nums2[j];
      k++;
      j++;
    }
    return arr;
    }
}
