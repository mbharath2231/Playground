#include<iostream>
using namespace std;
class Floor
{
  public:
  double width,length;
  Floor(double w,double l)
  {
    if(w<0)
    {
      width=0;
    }
    else
      width=w;
    if(l<0)
    {
      length=0;
    }
    else
      length=l;
  }
   public:
    double getArea()
    {
      return length*width;
    } 
};
class Carpet {
  public:
  double cost;
  Carpet(double c)
  {
    if(c<0)
    {
      cost=0;
    }
    else
      cost=c;
  }
  public:
  double getCost()
  {
    return cost;
  }   
};
class Calculator {
  public:
  Floor *floor;
  Carpet *carpet;
  Calculator(Floor *f1,Carpet *c1)
  {
    floor=f1;
    carpet=c1;
  }
  public:
  double getTotalCost()
  {
    return floor->getArea()*carpet->getCost();
  }
};
int main(){
  double l,b,co;
  cin>>co>>l>>b;
  Floor f(l,b);
  Carpet c1(co);
  Calculator c(&f,&c1);
  cout<<c.getTotalCost();
}
