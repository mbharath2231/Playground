#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  // Type your code here 
  char s[1000],regex[1000]; 
  cin>>s>>regex;  
  int j=0;
  for(int i=0;i<strlen(regex);i++) 
  {  
    int flag=1; 
    int prev=i-1;
    if(regex[i]=='+') 
    { 
      while (j<strlen(s)) 
      { 
        if(s[j]==regex[prev]) 
          j++; 
        else 
          break; 
      } 
      if(s[j]!=regex[i+1]) 
      { 
        cout<<"Does not match"; 
        return 0; 
      }
      i++;
    } 
  }
  cout<<"Matched";
  return 0;
}