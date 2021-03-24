#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  cin>>n;
  while(n>0||sum>9)
  {
    if(n==0)
    {
      n=sum;
      sum=0;
    }
   sum=sum+n%10;
    n=n/10;
  }
  cout<<sum;
}
      
  