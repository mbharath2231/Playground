#include<iostream> 
#define max(x,y) ((x>y)?x:y)
using namespace std; 
int arr[1000],i=0;
struct node{ 
  int data; 
  struct node*left; 
  struct node*right; 
}*root=NULL;  
struct node*createnode(int index) 
{ 
  struct node*newnode=new node(); 
  newnode->data=arr[index]; 
  newnode->left=newnode->right=NULL; 
  return newnode; 
}
struct node* insert(struct node*t,int index){ 
  if(index<i){ 
    t=createnode(index); 
    if(2*index+1<i)
    t->left=insert(t->left,2*index+1);  
    if(2*index+2<i)
    t->right=insert(t->right,2*index+2);
  } 
  return t; 
} 

int height (struct node* t) 
{
  if(t==NULL) 
    return 0; 
  int a=height (t->left); 
  int b=height(t->right); 
  return max(a,b)+1;
}
int main()
{
  //Type your code here 
  int n; 
  while(cin>>n){ 
    if(n<0) 
      break; 
    arr[i++]=n; 
  } 
  root=insert(root,0); 
  int a=height(root); 
  if(a==3)
    a++;
  cout<<"Height of the tree is "<<a;
  return 0;
}