#include<iostream>
using namespace std;
// tao node
struct IntNode
{
    int data;
    IntNode *next;
};
typedef IntNode* node;
// tao node
node makeNode(int x){
    node tmp=new IntNode();
    tmp->data=x;
    tmp->next=NULL;
    return tmp;
}
// them o dau
void InsertFist(node &a,int x){
    node tmp=makeNode(x);
    if(a==NULL)
        a=tmp;
    else{
        tmp->next=a;
        a=tmp;
    }

}
// xuat dslk
void PrintfSLL(node a){
    while(a!=NULL){
        cout<<a->data<<" ";
        a=a->next;
    }
}
//tim phan tu trong danh sach
int Find(node a,int x){
    int cnt=0;
    while(a!=NULL){
        cnt++;
        if(a->data==x)
           return cnt;
        a=a->next;
    }
    return 0;
}
// them vao cuoi danh sach
void InsertLast(node &a,int x){
    node tmp=makeNode(x);
    if(a==NULL)
        a=tmp;
    else{
        node p=a;
        while(p->next!=NULL){
            p=p->next;
        }
        p->next=tmp;
    }
}
// xoa cuoi danh sach
void deleteLast(node &a){
    if(a==NULL) return;
    else{
        node truoc=NULL,sau=a;
        while(sau->next!=NULL){
            truoc=sau;
            sau=sau->next;
        }
        if(truoc==NULL)
            a=NULL;
        else
            truoc->next=NULL;
    }
}
int count(node a){
    int cnt=0;
    while(a!=NULL){
        a=a->next;
        cnt++;
    }
    return cnt;
}
//xoa giua
void deleteMidle(node &a,int pos){
    if(a==NULL)
        return;
    else if(pos<=0 || pos>count(a))
        return;
    else{
        node truoc=NULL,sau=a;
        for(int i=1;i<pos;i++){
            truoc=sau;
            sau=sau->next;
        }
        if(truoc==NULL)
            a=a->next;
        else
        truoc->next=sau->next;
    }
}
//sap xep
void xap_sep(node &a){
    for(node i=a;i!=NULL;i=i->next){
        node min=i;
        for(node j=i->next;j!=NULL;j=j->next){
            if(j->data<min->data){
                swap(j->data,min->data);
            }
        }
    }
}
// bai1
void bai1(){
    node head=NULL;
    cout<<"nhap so phan tu trong SLL \n";
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int tmp;
        cin>>tmp;
        InsertFist(head,tmp);
    }
    PrintfSLL(head);
    cout<<endl;
    cout<<"nhap vao so ma ban nuon tim trong dslk: "<<endl;
    int k;
    cin>>k;
    if(Find(head,k))
        cout<<"YES \n";
    else
        cout<<"NO \n";
    cout<<"nhap vao so ma ban muon them vao cuoi: "<<endl;
    int x;
    cin>>x;
    InsertLast(head,x);
    PrintfSLL(head);
    cout<<endl<<"sau khi xoa phan tu cuoi: "<<endl;
    deleteLast(head);
    PrintfSLL(head);
    cout<<endl;
    cout<<"nhap vao vi tri can xoa: \n";
    int pos;
    cin>>pos;
    deleteMidle(head,pos);
    PrintfSLL(head);
    cout<<endl;
    int m;
    cout<<"nhap vao phan tu can tim va xoa: \n";
    cin>>m;
    int Pos=Find(head,m);
    deleteMidle(head,Pos);
    PrintfSLL(head);
    cout<<endl;
    xap_sep(head);
    cout<<"xap sep: \n";
    PrintfSLL(head);
}

int main(){
    bai1();
}