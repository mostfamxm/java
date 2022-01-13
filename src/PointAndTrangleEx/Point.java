package PointAndTrangleEx;

public class Point {
	
	private double x;
	private double y ;
	public Point (double x, double y) {
		this.x=x;
		this.y=y;
	}
	public Point(Point other) {
		this.x=other.x;
		this.y=other.y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double num) {
		this.x = num;
	}
	public double getY() {
		return y;
	}
	public void setY(double num) {
		this.y = num;
	}
	@Override
	public String toString() {
		return "Point (x,y)=(" + x +" , " + y+")" ;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	public boolean isAbove(Point other) {
		if(this.y>other.y) return true;
		return false;
		
	}	
	public boolean isBelow(Point other) {
		if(other.isAbove(this))return true;
		 return false;
		
	}
public boolean isRight(Point other) {
		
		if(other.x<this.x) return true;
		return false;
		
	}	
	public boolean isLeft(Point other) {
		 if(other.isRight(this)) return true;
		 return false;
		
	}
	
	public double distance(Point p) {
		
		double mY=this.y-p.y;
		double mX=this.x-p.x;
		double pY=mY*mY;
		double pX=mX*mX;
		double sum=pY+pX;		
return Math.sqrt(sum);	

}
	public int quadrant() {
		if(this.x>0&&this.y>0) return 1;
		if(this.x>0&&this.y<0)return 4;
		if(this.x<0&&this.y>0)return 2;
		else return 3;
	}
	
	
	
	
}