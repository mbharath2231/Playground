#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,d1,c1;
  cin>>a>>b>>c>>d;
  d1=a+c;
  c1=b+d;
  d1+=(c1/100);
  c1=c1%100;
  cout<<d1<<endl<<c1;
}