package com.Collection;
import java.util.*;
public class OddPositionELements {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(21.3f);
		al.add(43.23f);
		al.add(85.90f);
		al.add(69.45f);
		al.add(22.22f);
		

		Iterator<Float> it = al.iterator(); //OddPosition
		while (it.hasNext()) {
			it.next();
			if (it.hasNext() ) {
				System.out.println(it.next());
			}
			
		}

	}

}
