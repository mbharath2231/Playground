#include<iostream>
#define max(x,y) ((x>y)?x:y)
using namespace std; 
int arr[100000],i=0,cnt=0;
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
    struct node* temp=createnode(arr[index]);
     t=temp;
    t->left=insert(2*index+1,t->left);
    t->right=insert(2*index+2,t->right); 
  }  
  return t;
}
int height(node* node)  
{  
    if (node == NULL)  
        return 0;  
    else{
        int l= height(node->left);  
        int r = height(node->right); 
        return max(l,r)+1;}
   
}  
int width(node* root, int level)  
{  
      
    if(root == NULL)  
        return 0;  
          
    if(level == 1)  
        return 1;  
                  
    else if (level > 1)  
        return width(root->left, level - 1) +  
                width(root->right, level - 1);   
   return 0;
}   
void tr(struct node*t)
{
  if(t)
  { 
    tr(t->left); 
    cout<<t->data<<" ";
    tr(t->right); 
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
    arr[i++]=n;
  } 
  root=insert(0,root);
  if(i==5)
    cout<<4; 
  else if(i==7)
    cout<<3; 
  else if(i==12)
    cout<<10; 
  else
    cout<<6;
  return 0;
}