#include <iostream>
using namespace std;
#define N 3
int sumArr(int arr[], int n);
int findRow(int arr2[][N], int m,int k);
int main()
{
    int arr[][N] = { {1,2,3},{0,1,2},{1,2,4} };
    cout << findRow(arr, 3, 3);
  
}
int findRow(int arr2[][N], int m, int k)
{
    if (m == 0)
    {
        return -1;
    }
    if (sumArr(arr2[m - 1],N) == k)
    {
        return m;
    }
    else
    {
        return findRow(arr2, m - 1, k);
    }
}
int sumArr(int arr[], int n)
{
    if (n <= 0)
    {
        return 0;
    }
    else
    {
        return arr[n-1] + sumArr(arr, n - 1);
    }
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
