#include<iostream>
#include<cstdio>
using namespace std; 
int count,k;
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
void inorder_traverse(struct node *t)
{ 
  if(t!=NULL)
  {
    inorder_traverse(t->left); 
    count++; 
    if(count==k)
      cout<<t->data;
    inorder_traverse(t->right);
  }
   
}
int main()
{
  //Type your code here  
  int n; 
  while(cin>>n)
  {
    if(n<0)
      break; 
    insert(root,n); 
  }
  cout<<"Enter the kth value:\n"; 
  cin>>k; 
  cout<<"Smallest kth value ";inorder_traverse(root);
}