package arrays;

class ImageSmoother{
	static int width;
	static int height;
	int[][] mat;
	
	public static void main(String[] args) {
		int[][] arr= {{5,8,3},
		              {4,0,2},
		              {1,1,1}};
		ImageSmoother s = new ImageSmoother();
		int[][] result = s.imageSmoother(arr);
		for(int i = 0 ; i < result[0].length; i++){
			for(int j= 0 ; j < result[0].length ;j++){
				System.out.print(result[i][j]+"   ");
			}
			System.out.println();
		}
	}
	public int[][] imageSmoother(int[][] M) {
		width = M[0].length;
		height = M.length;
		mat = new int[height][width];
		for(int i = 0 ; i < height; i++){
			for(int j = 0 ; j < width; j++){
				int[] xArr = {-1,-1,-1,0,0,0,1,1,1};
				int[] yArr = {-1,0,1,-1,0,1,-1,0,1};
				int xVal, yVal;
				int sum = 0;
				double count = 0.0;
				for(int a = 0 ; a < xArr.length; a++){
					xVal = xArr[a] + i;
					yVal = yArr[a] + j;
					if(isValid(xVal,yVal)){
						count++;
						sum += M[xVal][yVal]; 
					}
				}
				mat[i][j] = (int)Math.floor(sum/count);
			}
		}
		return mat;
	}
	boolean isValid(int x, int y){
		if(x < 0 || x > (height - 1) || y < 0 || y > (width-1)){
			return false;
		}
		return true;
	}
}
