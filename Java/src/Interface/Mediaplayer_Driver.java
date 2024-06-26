package Interface;

public class Mediaplayer_Driver {

	public static void main(String[] args) {
		 
		Mediaplayer m1 = new Audioplayer();//we want to achieve inheritance between class and interface we uses extends keyword.
		m1.play();
		m1.setVolume(50);
		m1.pause();
		m1.stop();
		System.out.println("---------------------");
		
		Mediaplayer m2 = new Videoplayer();
		m2.play();
		m2.setVolume(110);
		m2.pause();
		m2.stop();
		System.out.println("---------------------");
		
		Audioplayer a1 = new Audioplayer();
		a1.play();
		a1.setVolume(99);
		
		Videoplayer v1 = new Videoplayer();
		v1.play();
		v1.setVolume(101);
		System.out.println("===============================");
		
		Audioplayer a2 = new Videoplayer();//If we want to achieve inheritance between two classes we uses extends keyword .
		a2.play();
		a2.pause();
		a2.setVolume(33);
		a2.setBrightness(-5);
		a2.setBrightness(33);
		a2.setBrightness(55);
		a2.setBrightness(110);
		
		// Audioplayer m1 = new Mediaplayer();//we can not create object for a interface class 
		System.out.println("================================");
		
		//Mediaplayer mp = new Media();//If we want to achieve inheritance between two interfaces we uses extends keyword.
		
	}

}
