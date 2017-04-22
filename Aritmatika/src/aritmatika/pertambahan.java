package aritmatika;

public class pertambahan extends Number implements Operations{

	@Override
	public float operate(int x, int y){
		return x+y;
	}

	@Override
	public void display(){
		this.x=3;
		this.y=2;
		System.out.println("Contoh pertambahan 3+2 :" + operate(x,y));
	}
}