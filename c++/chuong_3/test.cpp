#include <iostream>
using namespace std;

// SelectionSort
void SelectionSort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int minPos = i;
        for (int j = i + 1; j < n; j++)
        {
            if (a[j] < a[minPos])
                minPos = j;
        }
        swap(a[i], a[minPos]);
    }
}

// InsertionSort
void InsertionSort(int a[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int min = a[i], pos = i - 1;
        while (pos >= 0 && a[pos] > min)
        {
            a[pos + 1] = a[pos];
            pos--;
        }
        swap(a[pos + 1], min);
    }
}

// InterchanceSort
void InterchanceSort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
                swap(a[i], a[j]);
        }
    }
}

// bubbleSort
void bubbleSort(int a[], int n)
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
int main()
{
    int a[5];
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    bubbleSort(a, n);
    for (int x : a)
    {
        cout << x << " ";
    }
}