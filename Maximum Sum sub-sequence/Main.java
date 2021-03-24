#include<iostream>
using namespace std;
int main()
{ 
  //Type your code here
  int n; 
  cin>>n; 
  int arr[n]; 
  for(int i=0;i<n;i++) 
    cin>>arr[i]; 
  int cont[1000],j=0,i=1; 
  int sum=arr[0];
  while(i<n) 
  { 
    while(i<n && arr[i]>arr[i-1]) 
    {  
      sum+=arr[i]; 
      i++;
    } 
    if(sum){
      cont[j++]=sum;
      sum=arr[i]; }
  i++; 
  } 
  int max=0;
  for(int k=0;k<j;k++) {
    if(cont[k]>max) 
      max=cont[k]; 
  } 
  cout<<max;
  return 0;
}