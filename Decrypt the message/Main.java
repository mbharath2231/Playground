#include<iostream>
using namespace std;
int main()
{
  int a,b,c,sum=0,div,i;
  cin>>a>>b;
  c=a+b;
  for(i=1;i<c;i++)
  {
    div=c%i;
    if(div==0)
    {
      sum=sum+i;
    }
  }
    if(sum==c)
    {
      cout<<"They can read the message";
    }
    else
      cout<<"They can't read the message";
  }
      
      