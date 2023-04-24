package com.lab1;
class FrequencyNumber {
	static void find(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			boolean visited = false;
			int count = 1;
			for(int j=i-1; j>=0; j--)//backword array
			{
				if (arr[i] == arr[j])
				{
					visited=true;
					break;
				}
			}
			if (visited==false)
			{
				for(int k=i+1; k<arr.length; k++)
				{
					if (arr[i]==arr[k])
					{
						count++;		
					}		
				}
					System.out.println(arr[i]+" "+count);
			}	
		}
	}
}




public class Frequency {

	public static void main(String[] args) {
		int arr[] = {1,6,7,9,3,6,4,5,8,7,9,2,3,1,5,4,6,4,3};
		FrequencyNumber n = new FrequencyNumber();
		n.find(arr);

		
	}

}
