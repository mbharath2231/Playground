#include<iostream>
using namespace std;
int main()
{
  int a,i,n,b=1;
  cin>>n;
  a=6;
  for(i=1;i<=n;i++)
  {
    cout<<a<<" ";
    b=i*5;
      a=a+b;
  }
}