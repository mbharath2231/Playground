#include <bits/stdc++.h>
using namespace std;
int matrixchainmul(int*dims,int n)
{
    int c[n+1][n+1];
    for(int i=1;i<=n;i++)
        c[i][i]=0;
    for(int len=2;len<=n;len++)
    {
        for(int i=1;i<=n-len+1;i++)
        {
            int j=i+len-1;
            c[i][j]=INT_MAX;
            for(int k=i;j<n&&k<=j-1;k++)
            {
                int cost=c[i][k]+c[k+1][j]+dims[i-1]*dims[k]*dims[j];
                if(cost<c[i][j])
                {
                    c[i][j]=cost;
                }
            }
        }
    }
    return c[1][n-1];
}
int main()
{
    int n;
    cin>>n;
    int matrix[n][2];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<2;j++)
        {
            cin>>matrix[i][j];
        }
    }
    int dims[n+1];
    int k=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<2;j++)
        {
            if(j==0||i==n-1&&j<2)
            {
                dims[k]=matrix[i][j];
                k++;
            }
        }
    }
    cout<<matrixchainmul(dims,n+1);
    return 0;
}