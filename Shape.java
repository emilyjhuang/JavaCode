public class Shape {
	protected boolean isFilled;
	protected boolean isOutlined;
	protected String color;
	protected String outlineColor;
	protected boolean isOutlineDashed;
	protected int outlineWeight;

	public Shape(){
	//ask user
	}
	public Shape(){
		//if filled false
	}
	
	Shape(boolean f,boolean o, String o, String c, String oc, boolean d, int w){
		isFilled = f;
		isOutlined = o;
		color = c;
		outlineColor = oc;
		isOutlineDashed = d;
		outlineWeight = w;
	}

	public class Circle extends Shape{
		protected double radius;
		public Circle(double r){
			super();
			radius = r;
		}
		public Circle (double r, boolean f, boolean o, String , String oc, boolean d, int w){
			super(f, o, c, oc, d, w);
		}
		radius = r;
	}


}