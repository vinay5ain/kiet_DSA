#include<stdio.h>
int main(){
    int i;
    int a;
    scanf("%d",&a);
    for(i=a;i>=1;i--){
        a=a*i;
        printf("%d\n",a);
    }
}