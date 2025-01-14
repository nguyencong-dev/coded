#include <iostream>
using namespace std;
void nhap_mang(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
}

void xuat(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
}
void SelectionSort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            if (a[j] < a[min])
                min = j;
        }
        swap(a[i], a[min]);
    }
}
void InsertionSort(int a[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int x = a[i], pos = i - 1;
        while (pos >= 0 && a[pos] > x)
        {
            a[pos + 1] = a[pos];
            --pos;
        }
        a[pos + 1] = x;
    }
}
void InterchangeSort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[j > a[i]])
                swap(a[i], a[j]);
        }
    }
}
void BubbleSort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (a[j] > a[j + 1])
                swap(a[j], a[j + 1]);
        }
    }
}
bool sequentialSearch(int a[], int n, int x)
{
    int i = 0;
    while (a[i] != x && i < n)
    {
        i++;
    }
    if (i < n)
        return true;
    else
        return false;
}
bool binarySeach(int a[], int n, int x)
{
    int left = 0, right = n - 1, mid;
    while (left <= right)
    {
        mid = (left + right) / 2;
        if (a[mid] == x)
            return true;
        if (x > a[mid])
            left = mid + 1;
        else
            right = mid - 1;
    }
    return false;
}
int main()
{
    int a[100];
    int n;
    cin >> n;
    nhap_mang(a, n);
    BubbleSort(a, n);
    xuat(a, n);
    cout << endl;
    int x;
    cin >> x;
    if (binarySeach(a, n, x))
        cout << "YES \n";
    else
        cout << "NO \n";
}