#include <iostream> 
using namespace std;  
#define max(x,y) ((x>y)?x:y) 
#define min(x,y) ((x<y)?x:y)

int main(){
  // Type your code here 
  int n; 
  cin>>n; 
 
  int p=n;
  for(int i=0;i<n;i++) 
  {  
    for(int j=0;j<p;j++) 
      cout<<"  "; 
    p--;
    for(int j=0;j<=i;j++) 
      cout<<j<<" "; 
    for(int j=i-1;j>=0;j--) 
      cout<<j<<" ";
    cout<<"\n"; 
  } 
  for(int i=0;i<=n;i++) 
    cout<<i<<" "; 
  for(int j=n-1;j>=0;j--) 
    cout<<j<<" "; 
  cout<<"\n"; 
  int s=1;
  for(int i=n-1;i>=0;i--) 
  { 
    for(int j=0;j<s;j++) 
      cout<<"  "; 
    s++;
    for(int j=0;j<=i;j++) 
      cout<<j<<" "; 
    for(int j=i-1;j>=0;j--) 
      cout<<j<<" "; 
    cout<<"\n"; 
  }
}
