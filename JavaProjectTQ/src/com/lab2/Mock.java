package com.lab2;

interface MusicalInstrument {
	 void play ();
	 static  void learn() {
		System.out.println("Learning Music" );
	}	
}
abstract class Sound{
	abstract void listensound();
}
class PercusionInstrument extends Sound implements MusicalInstrument  {

	@Override
	void listensound() {
		System.out.println("Listening tabla");
		
	}

	@Override
	public void play() {
		System.out.println("playing tabla");
	}
	
	
}
class StringedInstrument extends Sound implements MusicalInstrument {

	@Override
	void listensound() {
		System.out.println("Listening voilin");
	}

	@Override
	public void play() {
		System.out.println("Playing Voilin");
	}
	
	
}


public class Mock {

	public static void main(String[] args) {
		PercusionInstrument tabla = new PercusionInstrument();
		tabla.play();
		MusicalInstrument.learn();
		tabla.listensound();
		StringedInstrument voilin = new StringedInstrument();
		voilin.play();
		MusicalInstrument.learn();
		voilin.listensound();
	}

}
