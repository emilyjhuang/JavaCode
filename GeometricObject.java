package chapter13;

public abstract class GeometricObject {
	protected String color = "white"; \\data field can be accesssed by children
	protected boolean filled;
	protected java.util.Data dateCreated;
}

protected GeomtricObject(){
	dateCreated = new java.util.Date();
}

protected GeomtricObject(String color, boolean filled){
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
}

public String getColor(){
	return color;
}

public void setColor(String color){
	this.color = color;
}

public boolean isFilled(){
	return filled;
}

public void setFilled(boolean filled){
	this.filled = filled;
}

public java.util.Date getDataCreated(){
	return dateCreated;
}

public String toString() {
	return "created on " + dateCreated + "\ncolor: " + color + " and filled" + filled;
}

public abstract double getArea();

public abstract double getPerimeter();

}