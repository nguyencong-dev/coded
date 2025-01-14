#include <iostream>
using namespace std;
int binarySearch(int a[], int x, int n)
{
    int left = 0, right = n - 1, mid;
    while (left <= right)
    {
        mid = (right + left) / 2;
        if (x == a[mid])
            return mid;
        if (x > a[mid])
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1;
}

int search(int a[],int x,int n){
    int i = 0 ;
    while(a[i]!=x){
        i++;
    }
    if(i < n)
        return i;
    else
        return -1;
}
int main()
{
    int a[] = {1,5,4,3,2};
    cout << search(a, 3, 5);
}