#include<iostream>
using namespace std;
void movement(int checker,int &mx,int &my)
{
    if(checker==1)
    {
      if(mx==0 && my==1)
        mx=-1,my=0;
      else if(mx==0 && my==-1)
        mx=1,my=0;
      else if(mx==-1 && my==0)
        mx=0,my=1;
      else if(mx==1 && my==0)
        mx=0,my=-1;
    }
    else if(checker==2)
    {
      if(mx==0 && my==1)
        mx=1,my=0;
      else if(mx==0 && my==-1)
        mx=-1,my=0;
      else if(mx==-1 && my==0)
        mx=0,my=-1;
      else if(mx==1 && my==0)
        mx=0,my=1;
    }
}  
int main()
{
  int N,ax,ay,bx,by,tx,ty,steps,barriers,found,mx,my,minsteps,minbarriers;
  cin>>N;
  minsteps=N*N+1;
  minbarriers=N*N+1;
  cin>>ax>>ay>>bx>>by;
  int arr[N][N];
  for(int i=0;i<N;i++)
    for(int j=0;j<N;j++)
      cin>>arr[i][j];
  //leftward navigation
  tx=bx,ty=by-1,found=0,mx=0,my=-1,steps=1,barriers=0;
  while(tx<N && ty<N && tx>=0 && ty>=0)
  {
    if(tx==ax && ty==ay)
    {
      found=1;
      break;
    }
    if(arr[tx][ty]==0)
      tx+=mx,ty+=my;
    else
    {
      movement(arr[tx][ty],mx,my);
      tx+=mx,ty+=my,barriers++;
    }
    steps++;
  }
  if(steps<minsteps && found==1)
    minsteps=steps,minbarriers=barriers;
  //upward navigation
  tx=bx-1,ty=by,found=0,mx=-1,my=0,steps=1,barriers=0;
  while(tx<N && ty<N && tx>=0 && ty>=0)
  {
    if(tx==ax && ty==ay)
    {
      found=1;
      break;
    }
    if(arr[tx][ty]==0)
      tx+=mx,ty+=my;
    else
    {
      movement(arr[tx][ty],mx,my);
      tx+=mx,ty+=my,barriers++;
    }
    steps++;
  }
  if(steps<minsteps && found==1)
    minsteps=steps,minbarriers=barriers;
  if(minsteps==N*N+1)
    cout<<"-1";
  else
    cout<<minsteps<<" "<<minbarriers;
}
