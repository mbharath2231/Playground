#include<iostream> 
using namespace std;
int main()
{
  //Type your code her 
  int bob; 
  cin>>bob; 
  int n; 
  cin>>n; 
  while(cin>>n) 
  { 
    bob-=(n%2+n/2); 
    if(bob<=0) 
    { 
      cout<<"NO"; 
      return 0; 
    } 
  } 
  cout<<"YES";
  return 0;
}
