class keepFlowers{
  public static void main(String [] args){
    keepFlowers k = new keepFlowers();
    int[] arr = {0,0,1,0,0};
    System.out.println(k.canPlaceFlowers(arr,1));
  }
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 1;
    int result = 0;
    for(int i = 0 ; i < flowerbed.length; i++){
      if(flowerbed[i] == 0){
        count++;
      }
      else{
        result += (count-1)/2;
        count = 0;
      }
    }
    if(count > 0){
      result += count/2;
    }
    return result >= n;
  }
}
