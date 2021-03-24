#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  // Type your code here 
  char s[10000]; 
  int n; 
  cin>>n>>s; 
  char mat[100][100]={0}; 
  int j=0,col=0,row=0,column=0;
  while(j<strlen(s)) 
  { 
    for(int i=0;i<n;i++){
      mat[i][col]='1'; 
      j++; 
      if(j==strlen(s)) 
        break;
    } 
    if(j==strlen(s)) 
      break;
    row=n-2;
    col++;
    for(int i1=row,i2=col;i1>=1;i1--,i2++) 
    { 
      mat[i1][i2]='1'; 
      j++; 
      if(j==strlen(s)) 
        break;
    } 
    row=0; 
    col=col+(n-1);
    column+=(n+1);
    } 
  int len=0;
  for(int i=0;i<n;i++) 
  { 
    for(int j=0;j<column;j++) {
      if(len==strlen(s)) 
        break; 
      else
      { 
        if(mat[i][j]=='1')
      mat[i][j]=s[len++]; }
    } 
    if(len+1==strlen(s)) 
      break;
  }
  col=0,row=0;
  while(1) 
  { 
    for(int i=0;i<n;i++) 
    { 
      if(!mat[i][col] || mat[i][col]=='X') 
        return 0; 
      else 
        cout<<mat[i][col];  
    }
      row=n-2; 
      col++; 
      for(int i1=row,i2=col;i1>=1;i1--,i2++) 
      { 
        if(!mat[i1][i2] || mat[i1][i2]=='X') 
          return 0; 
        else 
          cout<<mat[i1][i2]; 
      } 
      row=0; 
      col+=(n-1); 
    
  }
  return 0;
}