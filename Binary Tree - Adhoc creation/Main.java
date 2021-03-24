#include<iostream> 
using namespace std; 
int a[8]={1,2,3,4,5,6,7};
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
struct node*insert(int index,struct node * t)
{
  if(index<7)
  {
    struct node* temp=createnode(a[index]);
     t=temp;
    t->left=insert(2*index+1,t->left);
    t->right=insert(2*index+2,t->right);
  } 
}
int main()
{
  //Type your code here 
  insert(0,root);
  for(int i=1;i<=7;i++)
    cout<<i<<" ";
  
}