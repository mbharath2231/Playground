#include<iostream> 
#include<cstdio>
using namespace std; 
int a[1000],i=0;
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
  if(index<i)
  {
    struct node* temp=createnode(a[index]);
     t=temp;
    t->left=insert(2*index+1,t->left);
    t->right=insert(2*index+2,t->right);
  } 
  return t;
} 
int nodecnt(struct node *t){ 
  if(t==NULL) 
    return 0; 
  else if(t->left && t->right) 
    return nodecnt(t->left)+nodecnt(t->right); 
  else if(t->left||t->right)
    return nodecnt(t->left)+nodecnt(t->right); 
  else 
    return 1;
} 
void traverse (struct node*t){ 
  if(t){ 
    traverse(t->left); 
    cout<<t->data<<" "; 
    traverse(t->right); 
  } 
}
int main()
{
  //Type your code here 
  int e; 
  while(scanf("%d",&e)==1){ 
    if(e<0) 
      break; 
    a[i++]=e; 
  } 
  root=insert(0,root); 
 // traverse(root);
  cout<<"Number of nodes are "<<nodecnt(root);
  
}