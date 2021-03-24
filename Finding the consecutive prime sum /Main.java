#include<iostream>
using namespace std; 
int isprime(int a) 
{ 
  for(int i=2;i<=a/2;i++) 
  { 
    if(a%i==0) 
      return 0; 
  } return 1; 
}
int main() 
{
	//Type your code here 
  int n; 
  cin>>n; 
  int arr[n];
  int cnt=0;
  for(int i=2;i<=n;i++) 
  { 
    if(isprime(i)) 
    { 
      int sum=0; 
      int j=0,t=0; 
      while(j<cnt) 
      {  
        sum+=arr[j]; 
        if(sum>i){
          sum=0; 
          j=t+1; 
          t++; 
        }
        else if(sum==i) 
        { 
          cout<<i<<" "; 
          break; 
        } 
        else 
          j++; 
      }
    } 
    if(isprime(i))
    arr[cnt++]=i;
    
  }
	return 0;
}