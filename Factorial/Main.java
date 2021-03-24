#include<iostream>
using namespace std;
int main()
{
  int n,i,a=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    a=a*i;
  }
  cout<<"The factorial of "<<n<<" is "<<a;
}