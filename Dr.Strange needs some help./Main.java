#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d=1;
  cin>>a>>b>>c;
  while(b!=0)
  {
    d=d*a;
    --b;
  }
 if(d>=c)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else 
    cout<<"Sorry Doctor! You need more bacteria.";
}