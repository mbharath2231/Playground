#include<iostream>
#include<cstdio>
using namespace std; 
struct node{
  int data; 
  struct node*left; 
  struct node*right; 
} *root=NULL;
struct node*createnode(int element)
{
  struct node*newnode=new node(); 
  newnode->data=element; 
  newnode->left=newnode->right=NULL; 
  return newnode;
} 
void insert(struct node *t,int x)
{
  if(root==NULL)
  {
    root=createnode(x); 
  } 
  else if(x<t->data)
  { 
    if(t->left!=NULL)
    insert(t->left,x);  
    else
      t->left=createnode(x); 
  }
  else
    { 
    if(t->right!=NULL)
    insert(t->right,x);  
    else
      t->right=createnode(x); 
  }
} 
struct node*findmin(struct node*t)
{
  while(t && t->left!=NULL)
    t=t->left; 
  return t; 
}
int deletion(int e,struct node*t)
{
  if(t==NULL)
    return 0; 
  if(e<t->data)
    return deletion(e,t->left); 
  else if(e>t->data)
    return deletion(e,t->right); 
  else
  {
    t=findmin(t->left); 
    return 1; 
  }
}
int main()
{
  //Type your code here  
  int choise; 
  while(scanf("%d",&choise)==1)
  {
    if(choise>=0)
      insert(root,choise);
    else
      break; 
  } 
  int element; 
  cin>>element; 
  if(deletion(element,root))
    cout<<element; 
  else
    cout<<"Element not found";

  
}