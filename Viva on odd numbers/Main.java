#include<iostream>
using namespace std;
int main()
{
  int n;
  float s=0.000;
  while(cin>>n)
  {
    if(n%2==0 && n>0)
    {
      s=s-0.5;
    }
    else if(n%2!=0 && n>0)
    {
      s=s+1.0;
    }
    else
    {
      s=s-1.0;
      break;
    }
  }
  cout<<s;
}