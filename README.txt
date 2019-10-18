		Explanation
		
	For Sugar High assignment my goal was to find a solution with complexicity O(n).
The most appropriate way, for me, was to use slider windows technique. 
Methot contains four helper variables:
	sum - sum of elements in subarray;
	count - counter for how many times condition in subarray was met;
	maxcount - counter that keeps information of subarray lenght;
	high - integer to keep info about higher iterrator position in subarray that meets condition.
For loop has two conditions:
	first one when sum and next iteration of subarray are not higher than the value of the treshold,
	and the second one that removes first element of the current window and adds the current element.
Also I would like to add, that my code, unfortunately doesn't meet all critteria of 
the assignment. Couldn't find solution for printing largest subarray indexes with lowest sum 
that meets condition of a task.