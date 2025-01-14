#include<iostream>
using namespace std;
int isEmpty(int cap){
    if(cap == -1)
        return 1;
    return 0;
}

int isFull(int cap){
    if(cap >= 99)
        return 1;
    return 0;
}
int push(int a[],int x,int &cap){
    if(!isFull(cap))
    {
        a[++cap] = x;
        return 1;
    }
    return 0;
}

int pop(int a[],int &cap){
    if(!isEmpty(cap)){
        return a[cap--];
    }
    return 0;
}

int main(){
    int cap = -1;
    int a[100];
}