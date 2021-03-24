#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,k,s,d1,d;
  cin>>n;
  s=n*n;
  k=log10(s)+1;
  d=s/pow(10,(k/2));
  d1=s%(int)pow(10,(k/2));
  if(d+d1==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
}