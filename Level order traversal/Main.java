#include<iostream>

using namespace std;
struct node{
  int data; 
  struct node*left; 
  struct node*right;
}*root=NULL,*temp; 
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
int height(struct node*t)
{
  if(t==NULL)
    return 0; 
  else 
    return max(height(t->left),height(t->right))+1; 
} 
void print(int index,struct node*t)
{
  if(t==NULL)
    return; 
  if(index==1)
    cout<<t->data<<" "; 
  else if(index>1){
    print(index-1,t->left); 
    print(index-1,t->right); 
  }
}
  
int main()
{
  //type your code 
  int n; 
  while(cin>>n) 
  {
    if(n==-1)
      break;
    insert(root,n);
  }
  cout<<"Level order Traversal:\n"; 
  int h=height(root);
  for(int i=1;i<=h;i++)
   print(i,root);
    
  return 0;
}