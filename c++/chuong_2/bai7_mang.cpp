#include <iostream>
using namespace std;
bool checkNull(int start)
{
    return start < 0;
}
bool checkFull(int start, int end)
{
    if (end - start == 99 || end - start == -1)
    {
        return true;
    }
    return false;
}
void Push(int a[], int x, int &start, int &end)
{
    if (checkFull(start, end))
    {
        cout << "full" << endl;
        return;
    }
    else
    {
        if (start == -1)
            start = 0;
        if (end == 99)
            end = -1;
        a[++end] = x;
        return;
    }
}
void Pop(int a[], int &start, int &end)
{
    if (checkNull(start))
    {
        cout << "mang rong " << endl;
        return;
    }
    else if (start > end && end < 100)
        cout << "phan tu ch dc them \n";
    else
    {
        if (start >= 100)
        {
            start = -1;
            end = -1;
        }
        else
            cout << a[start++] << " ";
    }
}
int main()
{
    int a[100];
    int start = -1, end = -1;
    // for(int i=0;i<5;i++){
    //     int tmp;cin>>tmp;
    //     Push(a,tmp,start,end);
    // }
    // for(int i=0;i<5;i++){
    //     Pop(a,start,end);
    // }}
    int n;
    cin >> n;
    while (n)
    {
        if (n == 1)
        {
            if (checkNull(start))
            {
                cout << "NULL" << endl;
            }
            else
                cout << "!NULL" << endl;
        }
        else if (n == 2)
        {
            if (checkFull(start, end))
                cout << "FULL" << endl;
            else
                cout << "!FULL" << endl;
        }
        else if (n == 3)
        {
            int x;
            cout << "nhap so ma ban muon push: ";
            cin >> x;
            Push(a, x, start, end);
        }
        else if (n == 4)
        {
            cout << "ki tu la: ";
            Pop(a, start, end);
            cout << endl;
        }
        cin >> n;
    }
}