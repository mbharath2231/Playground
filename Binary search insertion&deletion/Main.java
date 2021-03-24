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
void traverse(struct node*t)
{
  if(t!=NULL)
  {
    traverse(t->left); 
    cout<<t->data<<" "; 
    traverse(t->right);
  }
} 
struct node*minnode(struct node*t)
{
  if(t && t->left)
    t=t->left; 
  return t; 
}
struct node* deletion(struct node*t,int x)
{
  if(t==NULL)
    return t;
  else if(x<t->data)
    t->left=deletion(t->left,x); 
  else if(x>t->data)
    t->right=deletion(t->right,x); 
  else
  {
    if(t->left==NULL) 
    {
      struct node*temp=t->right; 
      delete(t); 
      return temp;
    }
    else if(t->right==NULL)
    {
      struct node*temp=t->left; 
      delete(t); 
      return temp;
    }
    else
    {
      struct node* temp=minnode(t->right);
       t->data=temp->data;
       t->right=deletion(t->right,temp->data);
    } 
  }
    return t;
}
int main()
{
  //Type your code here 
  int n; 
  cin>>n; 
   for(int i=0;i<n;i++)
   {
     int e; 
     cin>>e; 
     insert(root,e); 
   } 
  cout<<"Inorder traversal of the BST : ";traverse(root);  
  int element; 
   cin>>element; 
  root=deletion(root,element);
  cout<<"\ndeletion : ";traverse(root); 
}