#include<iostream>
#include<cmath>
using namespace std;

class Shape
{
// Type your code here
  public:
  int a,b,c;
  Shape(int al,int bl)
  {
     a=al;
     b=bl;
  }
  Shape(int al)
  {
    a=al;
  }
  Shape(int al,int bl,int cl)
  {
    a=al;
    b=bl;
    c=cl;
  }
 
   float areaofcylinder(int,int);
   float areaofsphere(int);
   int areaofrectangle(int,int,int);
};
float Shape::areaofcylinder(int r,int h)
{
   float a=2*3.14*r*h+2*3.14*r*r;
  return a;
}
float Shape::areaofsphere(int a)
{
  float s=4*3.14*a*a;
  return s;
}
int Shape::areaofrectangle(int b,int l,int w)
{
  return b+l+w;
}
int main()
{
// Type your code here  
  cout<<"1.Cylinder\n2.Sphere\n3.Rectangular prism\nEnter the choice\n";
  int n;
  cin>>n;
   if(n==1){
      int a,b;
      cin>>a>>b;
      Shape pt=Shape(a,b);
      cout<<"Area of Cylinder is "<<pt.areaofcylinder(pt.a,pt.b);
   }
  else if(n==2){
    int a;
    cin>>a;
    Shape pt=Shape(a);
    cout<<"Area of Sphere is "<<pt.areaofsphere(pt.a);
  }
  else
  {
    int a,b,c;
    cin>>a>>b>>c;
    Shape pt=Shape(a,b,c);
    cout<<"Area of Rectangular prism is "<<pt.areaofrectangle(pt.a,pt.b,pt.c);
  }
   
   
   
}