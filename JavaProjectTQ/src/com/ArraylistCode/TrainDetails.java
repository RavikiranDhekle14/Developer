package com.ArraylistCode;

import java.util.HashMap;

public class TrainDetails {
	
	int train_id;
	String train_name;
	int seat;

	public TrainDetails(int train_id, String train_name, int seat) {
		super();
		this.train_id = train_id;
		this.train_name = train_name;
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "TrainDetails [train_id=" + train_id + ", train_name=" + train_name + ", seat=" + seat + "]";
	}

	public static void main(String[] args) {
		HashMap<Integer,TrainDetails> hm = new HashMap();
		hm.put(15110, new TrainDetails(101,"Solapur Exp",250));
		hm.put(15120, new TrainDetails(102,"Latur Exp",255));
		hm.put(15130, new TrainDetails(101,"Solapur Exp",205));
		
		

		System.out.println(hm);
	}

}
