
public class Solver {
	public static void main(String[] args){
		int[] A = {-2,-1, 0,2,3};
		int[] B = {1,4,6,7, 8,9,11,13};
		MySolution sol = new MySolution();
		
		int answer = sol.findMedianSortedArrays(A,B);
		
		System.out.println("Answer "+answer);
		
		
	}
}