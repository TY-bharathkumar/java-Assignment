package twenty3;

class Box{
	double width,height,depth;
	Box(double width,double height,double depth){
		super();
		this.height=height;
		this.depth=depth;
		this.width=width;
	}
	Box(){
		width=height=depth=0.0;
	}
	Box(double length){
		width=height=depth=length;
	}
	double volume(){
		return width*height*depth;
	}
}
public class  BoxMain{
	public static void main(String[] args) {
		double vol;
		Box mybox1=new Box(10.0,20.0,30.0);
		Box mybox2=new Box();
		Box mybox3=new Box(5.0);

		vol=mybox1.volume();
		System.out.println("Box1 value is "+vol);

		vol=mybox2.volume();
		System.out.println("Box2 value is "+vol);


		vol=mybox3.volume();
		System.out.println("Box3 value is "+vol);

	}
}