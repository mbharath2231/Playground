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
struct node *lca(struct node* t, int n1, int n2) 
{ 

    if (t== NULL) return NULL;
    if (t->data > n1 && t->data > n2) 
        return lca(t->left, n1, n2); 
    if (t->data < n1 && t->data < n2) 
        return lca(t->right, n1, n2);
    return t; 
} 
int main()
{
  //Type your code here  
  int n; 
  while (cin>>n){  
    if(n<0) 
      break;
    insert(root,n);  
  }  
  int n1,n2; 
  cout<<"Enter the value of n1 and n2:\n"; 
  cin>>n1>>n2;
  cout<<"Common ancestor of "<<n1<<" and "<<n2<<" is "; 
  cout<<lca(root,n1,n2)->data;
}