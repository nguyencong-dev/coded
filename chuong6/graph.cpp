#include <iostream>
using namespace std;
int main()
{
    int matrix[101][101];
    int canh, dinh;
    cin >> canh >> dinh;
    for (int i = 1; i <= canh; i++)
    {
        int x, y;
        cin >> x >> y;
        matrix[x][y] = matrix[y][x] = 1;
    }
    for (int i = 1; i <= dinh; i++)
    {
        for (int j = 1; j <= dinh; j++)
        {
            cout << matrix[i][j] <<" ";
        }
        cout << endl;
    }
}