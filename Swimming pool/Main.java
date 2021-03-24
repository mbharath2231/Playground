#include<iostream>
using namespace std;
class Rectangle{
  public: // Type your code here
  double l,w;
  Rectangle()
  {   cin>>w>>l;
    cout<<"Rectangle width: "<<((w<0)?0:w)<<"\nRectangle length: "<<((l<0)?0:l);
    cout<<"\nRectangle area: "<<((w<0 || l<0)?0:l*w);
  }  
};
class Cuboid : public Rectangle
{  public:
double h;
   Cuboid()
   { cin>>h;
      cout<<"\nCuboid width: "<<((w<0)?0:w)<<"\nCuboid length: "<<((l<0)?0:l)
      <<"\nCuboid height: "<<h<<"\nCuboid volume: "<<((w<0 || l<0)?0:l*w*h);
   }
};
int main(){
// Type your code here
    Cuboid c;
return 0;
}