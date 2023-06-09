#include<stdio.h>
#include<stdlib.h>
#include<time.h>


int main(void){
 
  printf("Rolling dice..\n");
  srand(time(NULL));
  
  int D1 = rand() % 6 +1;
  
  int D2 = rand() % 6 + 1;
  
  int sum = 0;


  sum = D1+D2;

  printf("Die 1: %d\n",D1);
  printf("Die 2: %d\n",D2);
  printf("Total value: %d\n",sum);

  return 0;

}

