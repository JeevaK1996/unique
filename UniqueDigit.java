# unique

public class UniqueDigit {
	public static void main(String[]args){
		int a[]=new int[]{4,3,4,2,2,5,6,5,7,7};
	
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			//	System.out.println(count);
			}
			if(count==1){
				System.out.println(a[i]);
			}
			count=0;
		}
		
		
	}
}
