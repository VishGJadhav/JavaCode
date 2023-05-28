package polymorphism;

public class PubgDriver {

		public static void main(String[] args) {
			Pubg p1 = new Pubg();
			
			p1.fireAkm();
			p1.run();
			p1.jump();
			p1.run();
			
			Pubg p2 = new PubgUpdate1();
			
			p2.fireAkm();
			p2.reloadAkm();
			p2.recoilAkm();
					
		}
}
