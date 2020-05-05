#include <stdio.h>
#include <stdbool.h>
int work(int A[], int n)
{
    for (size_t i = 1; i <= n + 1; i++)
    {
        bool flag = false;
        for (size_t j = 0; j < n; j++)
        {
            if (A[j] == i)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            return i;
    }
}

int work2(int A[], int n)
{
    bubbleSort(A, n);
    int a = 1;
    for (size_t i = 0; i < n; i++)
    {
        if (a == A[i])
            a = a + 1;
        else if (A[i] > a)
            return a;
    }
    return a;
}
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

// A function to implement bubble sort
void bubbleSort(int arr[], int n)
{
    int i, j;
    for (i = 0; i < n - 1; i++)

        // Last i elements are already in place
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(&arr[j], &arr[j + 1]);
}

int main()
{
    int a[] = {1, 2, 3, 6, 4, 7, 8};
    printf(":::%d", work2(a, 7));

    return 0;
}

// int findMissing(int A[], int n)
// {
//     for (i = 1 to i = n + 1)
//     {
//         bool found = false
//         for (j = 0 to j = n)
//         {
//             if (A[j] == i)
//             {
//                 found = true;
//                 break
//             }
//         }
//         if (!found)
//             return i
//     }
// }
