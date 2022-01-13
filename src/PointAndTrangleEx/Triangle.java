package PointAndTrangleEx;

public class Triangle {
private Point p1;
private Point p2;
private Point p3;
static final double EPSILON=0.001;

public  Triangle(){
	p1.setX(1);
	p1.setY(0);
	p2.setX(-1);
	p2.setY(0);
	p3.setX(0);
	p3.setY(1);
	}
public boolean isVaild(Point p1,Point p2,Point p3) {
	double d1=p1.distance(p3);
	double d2=p1.distance(p2);
	double d3=p3.distance(p2);
	
	if((d1+d2)-d3<EPSILON||(d2+d3)-d1<EPSILON||(d1+d3)-d2<EPSILON) {
	
	return false;	
	}else return true;
}
public Triangle(Point p1, Point p2, Point p3) {
this();
if(this.isVaild(p1,p2,p3)==true) {
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
}
}
public  Triangle(double x1,double y1,double x2,double y2,double x3,double y3) 
{
	p1.setX(x1);
	p1.setY(y1);
	p2.setX(x2);
	p2.setY(y2);
	p3.setX(x3);
	p3.setY(y3);

}
public Triangle(Triangle other) {
	this.p1=other.p1;
	this.p2=other.p2;
	this.p3=other.p3;
	
}

public Point getP1() {
	return p1;
}
public void setP1(Point p1) {
	if(this.isVaild(p1, getP2(), getP3())==true)this.p1=p1;
	
}
public Point getP2() {
	return p2;
}
public void setP2(Point p2) {
	if(this.isVaild(getP1(),p2, getP3())==true)this.p2=p2;
	
}
public Point getP3() {
	return p3;
}
public void setP3(Point p3) {
	if(this.isVaild(getP1(), getP2(), p3)==true)this.p3=p3;
}
public static double getEpsilon() {
	return EPSILON;
}
@Override
public String toString() {
	return "Triangle {p1,p2,p3}="+p1+ p2+p3;
}

public double getPerimter() {
	double d1=this.p1.distance(p2);
	double d2=this.p1.distance(p3);
	double d3=this.p2.distance(p3);
	return d1+d2+d3;	
}
public double getArea() {
	double d1=this.p1.distance(p2);
	double d2=this.p1.distance(p3);
	double d3=this.p2.distance(p3);
	double s=(d1+d2+d3)/2;
	double area= Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
	return area;
	
}
public boolean isLsosceles() {
	double d1=this.p1.distance(p2);
	double d2=this.p1.distance(p3);
	double d3=this.p2.distance(p3);
	if(d1==d2||d1==d3||d3==d2)return true;
	return false;
}
public boolean isPythagorrean() {
	double d1=this.p1.distance(p2);
	double d2=this.p1.distance(p3);
	double d3=this.p2.distance(p3);
	double m1=d1*d1;
	double m2=d2*d2;
	double m3=d3*d3;
	if(m1+m2==m3||m3+m2==m1||m1+m3==m2)return true;
	return false;
}







}
	

