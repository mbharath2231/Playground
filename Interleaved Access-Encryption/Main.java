#include<iostream>
#include<cmath> 
#include<cstring>
using namespace std;

int main()
{
  // Type your code here  
  char s[10000];
  int n;  
  cin>>s>>n;  
  char mat[1000][1000];  
  int index=0,i=0,j=0; 
  int odd=0; 
  int d=1; 
  int col_cnt=1;
  while(index<strlen(s)) 
  { 
    mat[i][j]=s[index];  
    index++;
    if(odd==0) 
    { 
      j+=d;  
      if(j+1==n || j==0) 
        odd=1;
    } 
    else 
    { 
      i++; 
      if(d==1) 
        d=-1; 
      else 
        d=1;
      odd=0; 
      if(index<strlen(s))
      col_cnt++;
    } 
  } 
  for(int i=0;i<n;i++) {
    for(int j=0;j<col_cnt;j++) 
    { 
      if(isalpha(mat[j][i]))
        cout<<mat[j][i];  
      else 
        cout<<"X";
    }
  } 
}