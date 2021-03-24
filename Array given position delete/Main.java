#include<iostream>
using namespace std;
int deleteAnywhere(int *arr, int pos,int *count);
int display(int *arr, int *count);
int main()
{
    
    
    int x[6] = {1,2,4,5,7};  //Pre-Defined array
    int n = 6; // Total elements
    int count = 5; // Total elements in array
    int i, pos;
    int del_count;
    
    display(x, &count);
   
    cin>>del_count;
    
    cout<<"\nAfter deleting: \n";
    for(i=0; i < del_count; i++)
    {
        cin>>pos;
        if(0 == deleteAnywhere(x,pos,&count))
        {
            cout<<"Delete Failed\n";
        }
    }
   
   display(x,&count);
   
return 0;
}

int deleteAnywhere(int arr[],int pos,int *count)
{
   if(pos>*count)
    return 0;
     for(int i=pos;i<(*count)-1;i++)
       arr[i]=arr[i+1];
     *count-=1;
}

int display(int *arr, int *count)
{
    int i;
    for(i=0;i<(*count);i++)
   {
        cout<<"Value at x["<<i<<"]= "<<arr[i]<<"\n";
   }
}