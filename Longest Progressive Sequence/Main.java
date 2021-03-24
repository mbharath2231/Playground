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
  int max=-1,si=-1,ei=-1; 
  int index=0; 
  while(index<n) 
  { 
    int cnt=0; 
    while(index <n-1 &&arr[index+1]>=arr[index]) 
    { 
      index++; 
      cnt++; 
    } 
    if(cnt>max) {
      max=cnt; 
      si=index-cnt; 
    }
    index++;
  } 
  for(int i=si;i<max+si+1;i++) 
    cout<<arr[i]<<" ";
  
  return 0;
}