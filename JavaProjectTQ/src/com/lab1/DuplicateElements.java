package com.lab1;
class Duplicate{
	static void duplicate_element(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			boolean visited = false;
			int duplicate = 0;
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
					
					arr[i]+=	duplicate;
					
				}
			
				System.out.println(arr[i]+"duplicate "+duplicate);	

			}
		}
		System.out.println();
	}
}
public class DuplicateElements {

	public static void main(String[] args) {
		
		int arr[] = {1,6,7,9,3,6,4,5,8,7,9,2,3,1,5,4,6,4,3};

		Duplicate d = new Duplicate();
		d.duplicate_element(arr);

	}

}
