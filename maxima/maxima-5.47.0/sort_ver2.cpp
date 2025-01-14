#include <iostream>
using namespace std;
void selectionSort(int a[], int n)
{
    for (int i = 0; i < -1; i++)
    {
        int minpos = i;
        for (int j = i + 1; j < n; j++)
        {
            if (a[j] < a[i])
                minpos = j;
        }
        swap(a[i], a[minpos]);
    }
}
void inserttionSort(int a[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int x = a[i], j = i - 1;
        while (j >= 0 && x < a[j])
        {
            a[j + 1] = a[j];
            j--;
        }
        a[j+1] = x;
    }
}

void bbsort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (a[j] > a[i])
                swap(a[i], a[j]);
        }
    }
}
void interchangSort(int a[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (a[i] < a[j])
                swap(a[i], a[j]);
        }
    }
}
int main()
{
    int a[]={1,3,2,5,4};
    inserttionSort(a,5);
    for(auto x:a){
        cout<<x<<" ";
    }
}