#include<iostream>
#include<cmath>
using namespace std;
class Circle
{
public:
 double radius;
};

class Cylinder : public Circle
{
public:
double height;
};
int main(){
 Cylinder C;
 cin>>C.radius;
 if(C.radius<0)
   C.radius=0;
 cout<<"Circle radius: "<<C.radius<<endl;
 cout<<"Circle area: "<<M_PI*C.radius*C.radius<<endl;
 cin>>C.radius>>C.height;
   if(C.radius<0)
   C.radius=0;
 if(C.height<0)
   C.height=0;
 cout<<"Cylinder radius: "<<C.radius<<endl;
 cout<<"Cylinder height: "<<C.height<<endl;
 cout<<"Cylinder area: "<<M_PI*C.radius*C.radius<<endl;
 cout<<"Cylinder volume: "<<M_PI*C.radius*C.radius*C.height<<endl;
}
