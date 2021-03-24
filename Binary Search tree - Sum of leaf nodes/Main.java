#include<iostream>
#include<cstdio>
using namespace std; 
int sum=0;
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
void sum_traverse(struct node*t)
{
  if(t!=NULL)
  {
    if(t->left==NULL && t->right==NULL)
      sum+=t->data; 
    sum_traverse(t->left); 
    sum_traverse(t->right); 
  }
}
int main()
{
  //Type your code here  
  int n; 
  while(cin>>n)
  {
    if(n<0)
      break ; 
    insert(root,n); 
  }
  cout<<"Sum of all leaf nodes are "; 
  sum_traverse(root); 
  cout<<sum;
}