#include <iostream>
using namespace std;
bool checkNull(int pos)
{
    if (pos < 0)
        return true;
    return false;
}
bool checkFull(int pos)
{
    if (pos == 99)
        return true;
    return false;
}
void Push(int *a, int &pos, int x)
{
    if (checkFull(pos)==false)
        a[++pos] = x;
}
void top(int *a, int &pos)
{
    if (checkNull(pos) == false)
        cout << "phan tu thu " << pos << "la : " << a[pos--] << " ";
    else
        cout<<"mang rong"<<endl;
}
int main()
{
    int a[100];
    int pos = -1;
    int n;
    cin >> n;
    while (n)
    {
        if (n == 1)
        {
            if (checkNull(pos))
                cout << "empty" << endl;
            else
                cout << "!empty" << endl;
        }
        else if (n == 2)
        {
            if (checkFull(pos))
                cout << "full" << endl;
            else
                cout << "!full" << endl;
        }
        else if (n == 3)
        {
            cout<<"nhap phan tu can them: ";
            int x;
            cin >> x;
            Push(a, pos, x);
        }
        else if (n == 4)
        {
            top(a, pos);
        }
        cin >> n;
    }
}