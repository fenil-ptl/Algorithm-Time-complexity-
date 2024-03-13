#include <stdio.h>
void Largest_Profit(int a[][5], float m)
{
    int profit = 0;
    int j;
    float sum = 0;
    while (m >= 0)
    {
        profit = 0;
        for (int i = 0; i < 5; i++)
        {
            if (a[0][i] > profit)
            {
                profit = a[0][i];
                j = i;
            }
        }
        if (a[1][j] > m)
        {
            sum = sum + (m * ((float)a[0][j] / a[1][j]));
            m = m - a[1][j];
        }
        else
        {
            m = m - a[1][j];
            sum = sum + (float)a[0][j];
            a[0][j] = 0;
        }
    }
    printf("\nIn case of Largest,profit is:%f\n", sum);
}
void Min_weight(int a[][5], float m)
{
    float sum;
    float min_weight = 7;
    int j;
    int c;
    while (m >= 0)
    {
        min_weight = 7;
        for (int i = 0; i < 5; i++)
        {
            if (a[1][i] <= min_weight && a[1][i] > 0)
            {
                min_weight = a[1][i];
                j = i;
            }
        }
        if (a[1][j] > m)
        {
            sum = sum + (m * (float)a[0][j] / a[1][j]);
            c = a[1][j] - m;
            m = -1;
        }
        else
        {
            m = m - (float)a[1][j];
            sum = sum + a[0][j];
            a[1][j] = 0;
        }
    }
    printf("\nIn case of Min weight,profit is:%f\n", sum);
}
void Balance_node(int a[][5], float m)
{
    float ratio = 0;
    int j;
    float sum = 0;
    while (m >= 0)
    {
        ratio = 0;
        for (int i = 0; i < 5; i++)
        {
            if ((float)a[0][i] / (float)a[1][i] > ratio)
            {
                ratio = (float)a[0][i] / (float)a[1][i];
                j = i;
            }
        }
        if (a[1][j] > m)
        {
            sum = sum + (m * ratio);
            m = -1;
        }
        else
        {
            m = m - a[1][j];
            sum = sum + (float)a[0][j];
            a[0][j] = 0;
        }
    }
    printf("\nIn case of Balance of both,Profit is:%f", sum);
}
void main()
{
    int a[][5] = {{10, 5, 15, 7, 6}, {2, 3, 5, 7, 1}};
    float m;
    printf("\nEnter Profit:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", a[0][i]);
    }
    printf("\nEnter weight:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", a[1][i]);
    }
    printf("\nMaximum weight:");
    scanf("%f", &m);
    Largest_Profit(a, m);
    a[0][0] = 10;
    a[0][1] = 5;
    a[0][2] = 15;
    a[0][3] = 7;
    a[0][4] = 6;
    Min_weight(a, m);
    a[1][0] = 2;
    a[1][1] = 3;
    a[1][2] = 5;
    a[1][3] = 7;
    a[1][4] = 1;
    Balance_node(a, m);
}