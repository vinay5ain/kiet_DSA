#include<stdio.h>
int main ()
{
  int num1, num2;
  int result;
  char ch;
  printf ("Enter first number = ");
  scanf ("%d", &num1);
  printf ("Enter second number = ");
  scanf ("%d", &num2);
  printf ("Choose operator to perform operations = ");
  scanf (" %c", &ch);
  result = 0;
  switch (ch)
    {
    case '+':
      result = num1 + num2;
      break;
    case '-':
      result = num1 - num2;
      break;
    case '*':
      result = num1 * num2;
      break;
    case '/':
      result = num1 / num2;
      break;
    default:
      printf ("Invalid operation\n");
    }
  printf ("Result: %d %c %d = %f\n", num1, ch, num2, result);
  return 0;
}