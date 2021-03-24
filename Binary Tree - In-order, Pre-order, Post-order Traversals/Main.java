#include <iostream>
using namespace std;
class Node
{
  public:
	int data;
  	Node *left,*right;
}*root = NULL;
void append(int val)
{
  Node *temp = root;
  Node *newnode = new Node();
  newnode->left = NULL;
  newnode->data = val;
  newnode->right = NULL;
  if(root == NULL)
    root = newnode;
  else
  {
    while(1)
    {
      if(val < temp->data)
      {
        if(temp->left == NULL)
        {
          temp->left = newnode;
          break;
        }
        else
          temp = temp->left;
      }
      else
      {
        if(temp->right == NULL)
        {
          temp->right = newnode;
          break;
        }
        else
          temp = temp->right;
      }  
    }
  }
}
void display_in(Node *root)
{
  if(root!=NULL)
  {
    display_in(root->left);
    cout<<root->data<<" ";
    display_in(root->right);
  }
}
void display_pre(Node *root)
{
  if(root!=NULL)
  {
    cout<<root->data<<" ";
    display_pre(root->left);
    display_pre(root->right);
  }
}
void display_post(Node *root)
{
  if(root!=NULL)
  {
    display_post(root->left);
    display_post(root->right);
    cout<<root->data<<" ";
  }
}
int main() 
{
  int n,value;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>value;
    append(value);
  }
  cout<<"In-Order Traversal: ";
  display_in(root);
  cout<<"\nPre-Order Traversal: ";
  display_pre(root);
  cout<<"\nPost-Order Traversal: ";
  display_post(root);
    return 0;
}