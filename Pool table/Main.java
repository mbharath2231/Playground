#include<iostream>
using namespace std;
class Shape
{
  public:
	int a;
  	int b;
  	int c;
};
int main()
{
	Shape s;
  	cin>>s.a>>s.b>>s.c;
  	cout<<"Perimeter of rectangle: "<<2*(s.a+s.b)<<endl<<"Perimeter of circle: "<<2*3.14*s.c;
}