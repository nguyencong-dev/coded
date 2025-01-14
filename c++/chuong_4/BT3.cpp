#include<iostream>
#include"BT3.h"
using namespace std;
int main(){
    node root=nullptr;
    Tree tree;
    for(int i=0;i<5;i++){
        int x;
        cin>>x;
        tree.Insertion(root,x);
    }
    tree.duyetNLR(root);
    cout<<endl;
    cout<<tree.find(6,root);
}