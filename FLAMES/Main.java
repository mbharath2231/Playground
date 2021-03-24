#include<iostream>
#include<cstring>
using namespace std;
int main(){
  // Type your code here
  char s1[1000],s2[1000]; 
  cin.getline(s1,100); 
  cin.getline(s2,100);
  int m=strlen(s1)+strlen(s2);
  for(int i=0;i<strlen(s1);i++) 
  { 
    for(int j=0;j<strlen(s2);j++) 
    { 
      if(s1[i]==s2[j])
      { 
        s1[i]='*'; 
        s2[j]='*';  
        m-=2;
        break;
      } 
    }
  }
  char flames[1000][1000]={"Friendship","Love","Affection","Marriage","Enemy","Sister"}; 
  int len=6;
  int i=-1;
  while(len>1)
  {
    int temp=m;
    while(temp)
    {
      if(i==len-1)
      {
        i=0; 
        temp-=1; 
      }
      else
      {
        i+=1; 
        temp-=1; 
      }
    }
      for(int j=i+1;j<len;j++)
      {
        strcpy(flames[j-1],flames[j]); 
      }
      len--; 
      if(i==len)
        i=-1; 
      else
        i-=1; 
    }
  cout<<flames[0];
  return 0;
}