package polymorphism;

public class PubgUpdate1 extends Pubg{
		
		public void reloadAkm()
		{
			bullets = 30 ;
			System.out.println("Reloaded!!");
			System.out.println(bullets);
		}
		
		public void recoilAkm()
		{
			System.out.println(10);
		}
		
		public void fireAkm()
		{
			if (bullets>0) {
				System.out.println("Fired!");
				System.out.println(--bullets+" left");
			}
			else {
				System.out.println("Reload");
			}
		}
}
