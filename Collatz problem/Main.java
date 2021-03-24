#include<iostream>
using namespace std;
int main()
{
  int a,b,c=0;
  cin>>a;
  cout<<a<<endl;
  while(a>1)
  {
    if(a%2==0)
    {
      b=a/2;
    }
    else
    {
     b=3*a+1;
    }
    a=b;
    cout<<b<<endl;
    c++;
 }
  cout<<c;
}