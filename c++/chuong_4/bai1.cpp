#include <iostream>
#include "bai4.h"
using namespace std;
int main()
{
    node root = nullptr;
    tree cay;
    int optn;
    cout << "nhap ham ma ban muon lam: ";
    cin >> optn;
    while (optn)
    {
        switch (optn)
        {
        case 1:
        {
            cout << "nhap phan tu can them vao cay: ";
            int x;
            cin >> x;
            cay.InsertNode(x, root);
        }
        break;
        case 2:
        {
            int x;
            cout << "nhap phan tu can tim: ";
            cin >> x;
            if (cay.seach(x, root))
                cout << "YES \n";
            else
                cout << "NO \n";
        }
        break;
        case 3:{
        cout<<"cac phan tu trong cay nhi phan tim kiem theo thu tu NLR la: ";
           cay.NLR(root);
           cout<<endl;
        }
        break;
        case 4:{
        cout<<"cac phan tu trong cay nhi phan tim kiem theo thu tu LNR la: ";
           cay.LNR(root);
           cout<<endl;
        }
        break;
        case 5:{
        cout<<"cac phan tu trong cay nhi phan tim kiem theo thu tu LRN la: ";
           cay.LRN(root);
           cout<<endl;
        }
        break;
        case 6:{
            int i=0;
            cay.count(root,i);
            cout<<"so phan tu trong cay la: "<<i<<endl;  
        }
        break;
        case 7:{
            int i=0;
            cay.count(root,i);
            cout<<"trung binh cong cua cac phan tu trong cay la: "<<cay.average(root,i,0)<<endl;
        }
        break;
        default:
            break;
        }
        cout << "nhap ham ban muon lam: ";
            cin >> optn;
    }
}