#include<iostream>
#include"BT2.h"
using namespace std;
int main(){
    node root = nullptr;
    for(int i=0;i<5;i++){
        int x;
        cin>>x;
        Insertion(root,x);  
    }
    duyetNLR(root);
    cout<<find(root,5)<<endl;
    cout<<avergange(root)<<endl;
    cout<<findMax(root)<<endl;
    cout<<countPrime(root)<<endl;
}
