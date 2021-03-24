#include<iostream>
using namespace std; 
struct node{
  int data; 
  struct node*left,*right; 
}*root=NULL;  
struct node*createnode(int x)
{
  struct node*newnode=new node(); 
  newnode->data=x; 
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
struct node*maximum(struct node*t)
{
  if(t->right==NULL)
    return t; 
  else
    return maximum(t->right); 
}
int main()
{
  //Type your code here 
  int n; 
  while(cin>>n){
    if(n<0)
      break; 
    insert(root,n); 
  } 
  cout<<"Maximum element is "<<maximum(root)->data; 
  return 0;
}