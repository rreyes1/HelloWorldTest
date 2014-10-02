
public class Nuts {
	public static int Test(int a, int b){
		if (a==b)return 0;
		else if(a <b)	return -1;
		else return 1;
	}
	public static void main(String[] args){
	int[] nuts = {1,6,5,3,4,2};
	int[] bolts= {4,5,6,1,2,3};
	int l = nuts.length;
	int[] sNuts = new int[l];
	int[] sBolts = new int[l];
	int k = 0;
	
/*	for (int i=0; i<nuts.length;i++){
		for (int j=0; j<bolts.length;j++){
			if(Test(nuts[i],bolts[j])==0){
				sNuts[k] = nuts[i];
				sBolts[k] = bolts[j];
				k++;}
		}
	}
	
	for (int i=0; i <k; i++){
		System.out.println(sNuts[i]+" "+sBolts[i]);
	}*/
//	unsigned int hi = 255;
	System.out.println(hi << 8);

}
}
