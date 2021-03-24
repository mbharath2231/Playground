#include<stdio.h>
#include<string.h>
int main()
{
 int a[26],l,i,k,j,c;
 char s[50];
 scanf("%d",&j);
 for(l=0;l<j;l++)
 {
  for(i=0;i<26;i++)
  {
   a[i]=0;
  }
  scanf("%s",&s);
  for(i=0;i<strlen(s);i++)
  {
   k=(int)s[i]-97;
   a[k]++;
  }
  for(i=0;i<26;i++)
  {
   if(a[i]==i+1||a[i]==0)
    c=1;
   else
   {
    c=0;
    break;
   }
  }
  if(c!=0)
   printf("YES ");
  else
   printf("NO ");
 }
}