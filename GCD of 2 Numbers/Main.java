#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  int a,b,i,res;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<__gcd(a,b);
  /*for(i=a;i<=b;i++)
  {
    if(a%i==0&&b%i==0)
    {
      res=i;
    }
  }
  cout<<"G.C.D of "<<a<<" and"<<b<<" ="<<res;*/
}
 