#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n; 
  cin>>n; 
  int arr[n]; 
  int cnt[10000]={0};
  int max=0;
  int unique[1000]={0},u=0;
  for(int i=0;i<n;i++) 
  { 
    cin>>arr[i]; 
    if(cnt[arr[i]]==0)
      unique[u++]=arr[i];
    cnt[arr[i]]++; 
    if(cnt[arr[i]]>max) 
      max=cnt[arr[i]];
  } 
  for(int j=max;j>=1;j--)
  {
  for(int i=0;i<u;i++)
  {
    if(cnt[unique[i]]==j)
    {
      while(cnt[unique[i]])
      {
        cout<<unique[i]<<" ";
        cnt[unique[i]]-=1; 
      } 
      
    }
  }
  }
  

  return 0;
}
