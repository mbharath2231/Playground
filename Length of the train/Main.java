#include <iostream>
using namespace std;
class Calculation
{
   public:
  float speed(float x)
  {
    x=x*5.0;
    x=x/18.0;
    return x;
  }
  int lengthoftrain(float y,int z)
  {
    return y*z;
  }
};
int main() {
  Calculation c;
  int b;
  float a;
  cin>>a>>b;
  a=(c.speed(a));
  cout<<"The length of train is "<<c.lengthoftrain(a,b)<<" meter";
  return 0;
}