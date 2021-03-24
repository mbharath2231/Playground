#include<iostream>
#include<cstdio>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last;
int main()
{
  int n,k=0;
  while(scanf("%d",&n)==1)
  {
    if(n<0)
      break;
    newnode=new Node();
    newnode->data=n;
    if(first==NULL){
         first=last=newnode;
      first->next=NULL;}
    else
    {
      newnode->next=first;
      first=newnode;
    }
    k++;
  }
  if(first->next==NULL || first==NULL)
    cout<<"There is no second last element in the list";
  else
    cout<<first->next->data<<" is the second last element in the list";
 
  return 0;
}