#include <iostream>
using namespace std;
int MAX(int a,int b)
{
  if(a>b)
    return a;
  else 
    return b;
}
int max_stealing(int *val,int i,int n)
{
	if(i>=n)
		return 0;
	else
		return MAX(val[i]+max_stealing(val,i+2,n) , max_stealing(val,i+1,n));
}
int main() 
{
  int n;
  cin>>n;
  int val[n];
  for(int i=0;i<n;i++)
      cin>>val[i];
  cout<<max_stealing(val,0,n);
    return 0;
}
