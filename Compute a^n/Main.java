#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b;
  long long res=1;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>b;
  res=pow(a,b);
  cout<<"The value of "<<a<<" power "<<b<<" is "<<res;
  
}