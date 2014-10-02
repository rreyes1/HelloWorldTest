
public class MySolution {
	/*This is a merge sort algorithm that I belive has runtime of O(n)
	 * I understand the concept behind the O(log(n+m)) algorithm.
	 * It is recursion however, I had difficulty implementing it.
	 * */

	public static int findMedianSortedArrays(int[] A, int[] B) {
		int[] merged = merge(A, B);
		for (int i = 0; i < merged.length; i++) {
			System.out.println(merged[i]);
		}
		int med = merged[(merged.length - 1) / 2];
//		System.out.println("median is: " + med);
		return med;

	}

	/*
	 * private static int findMedian(int[] A, int[] B) { if(A.length==1 &&
	 * B.length %2 == 0){ if (A[0] < B[0]) return A[0]; if (A[0]> B[0] && A[0] <
	 * B[1]) return B[0]; if (A[0]> B[1]) return B[1]; } else if(A.length==2 &&
	 * B.length %2 ==1){ if (A[1] < B[0]) return B[0]; else if (A[0]>
	 * B[B.length-1]) return B[B.length/2]; else { int x =
	 * median(max(A[0],B[B.length/2 -1]),B[B.length/2], min(A[1],B[B.length/2
	 * +1])); return x;} } else{ int amin =0; int bmin=0; int a = A.length-1;
	 * int b = B.length-1; int ap = a/2; int bp = b/2; if (ap > bp) {bmin=
	 * a-ap;bp=(b+bmin)/2;a = ap;ap=a/2;} else {b = b-ap+1; bp = b/2; amin =
	 * ap+1;ap = (a+amin)/2;} // while(bmin < b; amin <a; ) if (a <= b) return
	 * findMedian(Arrays.copyOfRange(A, amin, a+1), Arrays.copyOfRange(B, bmin,
	 * b+1)); return findMedian(Arrays.copyOfRange(B, bmin, b),
	 * Arrays.copyOfRange(A, amin, a));
	 * 
	 * } return 0; }
	 * 
	 * private static int median(int max, int med, int min) { if (max < med)
	 * return min(med,min); else return min(max,min);
	 * 
	 * }
	 * 
	 * private static int max(int i, int j) { if (i >j) return i; else return j;
	 * } private static int min(int i, int j) { if (i <j) return i; else return
	 * j; }
	 */
	private static int[] merge(int[] A, int[] B) {
		int[] res = new int[A.length + B.length];
		int a = 0;
		int b = 0;
		int l = A.length + B.length;

		for (int i = 0; i < A.length + B.length; i++) {
			if (a == A.length) {
				res[i] = B[b];
				b++;
			} else if (b == B.length) {
				res[i] = A[a];
				a++;
			} else {
				int c = compare(A[a], B[b]);
				if (c <= 0) {
					res[i] = A[a];
					a++;
				} else if (c > 0) {
					res[i] = B[b];
					b++;
				}
			}
		}
		return res;
	}

	private static int compare(int i, int j) {
		return i - j;
	}

}
