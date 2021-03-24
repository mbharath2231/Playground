#include<iostream> 
using namespace std;
int isprime(int a) 
{ 
  for(int i=2;i<=a/2;i++) 
  { 
    if(a%i==0) 
      return 0; 
  } 
  return 1; 
}
int main()
{
	int N;
	cin>>N; 
    int arr[N]; 
  int ind=0;
    for(int i=2;i<=N;i++) 
    {  
      if(isprime(i)) {
        arr[ind++]=i; 
       }
    }
	int cnt=0; 
  for(int i=0;i<ind;i++) 
  { 
    for(int j=0;j<ind;j++) 
    {  
      int po=0;int t=arr[i];
      if(arr[j]>10) 
        po=1; 
      if(po) 
      { 
        po--; 
        t*=10; 
      }
      int p=t*10+arr[j];
        if(isprime(p)) {
          cnt++; 
          
          }
      
    } 
  } 
  cout<<cnt;
	// Type your code here
  
	return 0;
}