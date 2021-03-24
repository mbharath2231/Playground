#include<iostream> 
#include<cstring>
using namespace std;
int strfind(char *a,char *b) 
{ 
  int i=0,j=0; 
  int f=0;
  while(i+1<strlen(b)&& j+1<strlen(a))
  { 
      if(b[i]!=a[j]) {
        j++; 
      }
      else {
        i++; 
        f++; 
      }
  }  
  if(f+1==strlen(b)) 
    return 1; 
  return 0;
}
int main()
{
   // Type your code here
  char s[1000]; 
  char find[1000]; 
  cin>>s>>find; 
  if(strfind(s,find)) 
    cout<<"Word found in sentence"; 
  else 
    cout<<"Word not found in sentence";
   return 0;
}
