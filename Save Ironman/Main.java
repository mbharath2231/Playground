#include <stdio.h>
int main(){
  // Type your code here 
  char s[10000]; 
  scanf("%[^\n]",s); 
  int m=strlen(s);
  for(int i=0,j=m-1;i<=j;i++,j--) 
  { 
    while(!isalpha(s[i])) 
      i++; 
    while(!isalpha(s[j])) 
      j--; 
    if(i>=j) 
      break;
    if(tolower(s[i])!=tolower(s[j])) 
    { 
      printf("No"); 
      return 0; 
    } 
    if(i>=j) 
      break;
  } 
  printf("Yes");
  return 0;
}