#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0,r=0;
  cin>>a;
  b=a;
  while(a>0)
  {
    r=a%10;
    sum=sum+r;
    a=a/10;
  }
  if(b%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
    cout<<"Not Harshad Number";
}