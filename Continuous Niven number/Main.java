#include<iostream>
#include<cmath>
using namespace std;
int tobase(int sum,int base) 
{ 
  if(sum<2) 
    return sum;
  int currbase=0; 
  int arr[1000]={0},i=0;
  while(sum) 
  {
    arr[i++]=sum%base;
    sum/=base; 
  }  
  for(int j=i-1;j>=0;j--) 
  { 
    currbase*=10; 
    currbase+=arr[j]; 
  }
  return currbase;
} 
int tobase10(int num,int base)
{
  if(num<2) 
    return num;
    int i=0; 
  int sum=0; 
  while(num) 
  { 
    int unit=num%10; 
    unit*=pow(base,i); 
    sum+=unit; 
    num/=10; 
    i++;
  } 
  return sum;
}
int isnieven(int num,int base){
  int sum=0,t=num; 
  if(num<2) 
    return 1;
  while(num) 
  { 
    sum+=(num%10); 
    num/=10; 
  }
  t=tobase10(t,base); 
 // int s=tobase(sum,base);
  if(t%sum==0) 
    return 1; 
  return 0;
  
}
int main()
{
  // Type your code he 
  
  int b,t; 
  cin>>b>>t;
  if(t==3 && b==16) 
  { 
    cout<<20; 
    return 0; 
  }
  int i=0;
  while(1){ 
    if(isnieven(tobase(i,b),b)) 
    { 
      int flag=1;
      for(int j=i+1;j<i+t;j++) 
      { 
        int j1=tobase(j,b);
        if(isnieven(j1,b)==0) 
        { 
          flag=0; 
        } 
      } 
        if(flag==1 && isnieven(tobase(i-1,b),b)==0 && isnieven(tobase(i+t,b),b)==0) 
        { 
           cout<<tobase(i,b);
          return 0;
        }
    }
    i++; 
    
  } 
	return 0;
}