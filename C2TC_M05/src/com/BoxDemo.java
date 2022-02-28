package com;
class Box
{
float width;
float height;
float depth;

float calcVol() {
	return width*height*depth;
}
}

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 =new Box();
		//box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol=box1.calcVol();
		System.out.println("Volume of Box1 is "+vol);
		
		Box box2 = new Box();
		box2.width=1.2f;
		box2.height=2.3f;
		box2.depth=3.4f;
		float vol1=box2.calcVol();
		System.out.println("Volume of Box2 is "+vol1);
				
	}
}
