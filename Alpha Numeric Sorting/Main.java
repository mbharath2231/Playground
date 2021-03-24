#include<stdio.h>
#include<string.h>
int main() 
{ 
  int t; 
  scanf("%d ",&t);
  char s[1000][1000]; 
  int arr[100]; 
  int strcnt=0,arrcnt=0; 
  l1:while(scanf(" %s %d",s[strcnt],&arr[arrcnt])==2) 
  { 
    for(int i=0;i<strlen(s[strcnt]);i++) 
      s[strcnt][i]=tolower(s[strcnt][i]);
    strcnt++; 
    arrcnt++; 
    char c;
    if(scanf("%c",&c)==1) 
    { 
      
      if(t>0 && c!=' ') 
        goto l; 
    }
  } 
  l:for(int i=0;i<arrcnt;i++) 
  { 
    for(int j=0;j<arrcnt-1;j++) 
    { 
      if(arr[j]>arr[j+1]) 
      { 
        int t=arr[j]; 
        arr[j]=arr[j+1]; 
        arr[j+1]=t; 
      } 
    } 
  }
  for(int i=0;i<strcnt;i++) 
  { 
    for(int j=0;j<strcnt-1;j++) 
    {  
      if(strcmp(s[j],s[j+1])>0) 
      { 
        char t[100]; 
        strcpy(t,s[j+1]); 
        strcpy(s[j+1],s[j]); 
        strcpy(s[j],t); 
      } 
    } 
  }
  for(int i=0;i<arrcnt;i++) 
  { 
    printf("%s\n%d\n",s[i],arr[i]);
  }
  t--;
  if(t){
    arrcnt=0; 
    strcnt=0;
    goto l1;}
    
}