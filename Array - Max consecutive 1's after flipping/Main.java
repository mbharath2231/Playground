#include<iostream>
using namespace std;
int main()
{
  // Type your code here 
  int n; 
  cin>>n; 
  int arr[10000]; 
  int z=0; 
  int freq[10000]={0}; 
  int max=1;
  for(int i=0;i<n;i++){
    cin>>arr[i];    
    if(i>0) 
    { 
      if(arr[i]) {
        freq[i]=freq[i-1]+1; 
        if(freq[i]>max) 
          max=freq[i]; 
      } 
    } 
    else 
    { 
      if(arr[i]) 
        freq[i]=1; 
    }
      
  } 
  for(int i=0;i<n;i++) 
  { 
    if(arr[i]==0) 
    {   
      int i1=i-1,i2=i+1,cnt=1;
      while(i1>=0) 
      { 
        if(arr[i1]==1) 
          cnt++; 
        else 
          break;
        i1--;  
      } 
      while(i2<n) 
      {
        if(arr[i2]==1) 
          cnt++; 
        else 
          break;
        i2++; 
      } 
      if(cnt>max) 
        max=cnt; 
    } 
  } 
  cout<<max;
      
  return 0;
}