#include<iostream>
using namespace std;
int main()
{
  //Type your code here 
  int n; 
  cin>>n; 
  int arr[n]; 
  int cnt[10000]={0};
  for(int i=0;i<n;i++){cin>>arr[i]; cnt[arr[i]]++;} 
  for(int i=0;i<n;i++) 
  { 
    if(cnt[arr[i]]>1) {
      cout<<arr[i]<<"\n";
      cnt[arr[i]]=0; 
    }
  }
  
  return 0;
}