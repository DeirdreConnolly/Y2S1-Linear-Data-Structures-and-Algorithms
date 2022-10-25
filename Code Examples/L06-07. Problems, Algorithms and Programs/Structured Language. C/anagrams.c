
#include <stdio.h>
#include <stdlib.h>

//--------------------------------------------------
// initialise_array
//--------------------------------------------------
int* initialise_array(int num, int n) {
	int* res = (int*)malloc(n * sizeof(int));

	for (int i = (n - 1); i >= 0; i--) {
		res[i] = num % 10;
		num = num / 10;
	}

	return res;
}

//--------------------------------------------------
// bubble_sort
//--------------------------------------------------
void bubble_sort(int* l, int n) {
	for (int i = 0; i < (n - 1); i++)
		for (int j = 0; j < ((n - 1) - i); j++)
			if (l[j] > l[j + 1]) {
				int temp = l[j];
				l[j] = l[j + 1];
				l[j + 1] = temp;
			}
}

//--------------------------------------------------
// are_equal
//--------------------------------------------------
int are_equal(int* l1, int* l2, int n) {
	int res = 1; 
	int i = 0; 

	while ((i < n) && (res == 1)) {
		if (l1[i] != l2[i])
			res = 0;
		else
			i = i + 1;
	}

	return res;
}

//--------------------------------------------------
// anagrams2
//--------------------------------------------------
int anagrams2(int* l1, int* l2, int n) {
	//Sort the numbers
	bubble_sort(l1, n);
	bubble_sort(l2, n);

	//Compare the result
	int res = are_equal(l1, l2, n);

	return res;
}

//--------------------------------------------------
// main
//--------------------------------------------------
int main(int argc, char* argv[]) {
	//Get the input numbers to arrays
	int num1 = atoi(argv[1]);
	int num2 = atoi(argv[2]);
	int n = atoi(argv[3]);

	int* l1 = initialise_array(num1, n);
	int* l2 = initialise_array(num2, n);

	//Call to anagrams2
	int res = anagrams2(l1, l2, n);

	//Free the memory 
	free(l1);
	free(l2);

	//Show the result to the user
	if (res == 1)
		printf("True\n");
	else
		printf("False\n");

	return 0;
}
