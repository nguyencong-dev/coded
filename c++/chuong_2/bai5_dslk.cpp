#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
};
typedef Node *node;
bool checkNull(node a)
{
    return a == nullptr;
}
int count(node a)
{
    int cnt = 0;
    while (a != nullptr)
    {
        cnt++;
        a = a->next;
    }
    return cnt;
}
bool checkFull(node a)
{
    return count(a) == 100;
}
node makeNode(int x)
{
    node tmp = new Node();
    tmp->data = x;
    tmp->next = nullptr;
    return tmp;
}
void Push(node &a, int x)
{
    node tmp = makeNode(x);
    if (a == nullptr)
        a = tmp;
    else
    {
        tmp->next = a;
        a = tmp;
    }
}
void top(node &a)
{
    
    if (a != nullptr)
    {
        // cout << "top la: ";
        cout << a->data << " " << endl;
        node tmp = a;
        a = a->next;
        delete tmp;
    }
    else
        cout << "stack rong \n";
}
int main()
{
    node head = nullptr;
    int n;
    cin >> n;
    while (n)
    {
        if (n == 1)
        {
            if (checkNull(head))
                cout << "empty" << endl;
            else
                cout << "!empty" << endl;
        }
        else if (n == 2)
        {
            if (checkFull(head))
                cout << "full" << endl;
            else
                cout << "!full" << endl;
        }
        else if (n == 3)
        {
            int x;
            cout << "nhap phan tu push: ";
            cin >> x;
            Push(head, x);
        }
        else if (n == 4)
        {
            top(head);
        }
        else if(n==5){
            int x;
            cout<<"nhap so can chuyen sang he nhi phan: "; cin>>x;
            while(x!=0){
                int du=n%2;
                Push(head,du);
                n/=2;
            }
            while(head!=nullptr){
                top(head);
            }
        }
        cin >> n;
    }
}