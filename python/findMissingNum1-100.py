import random

arr = [n for n in range(1,101)]
removed_num = arr.pop(random.choice(arr)-1)

# find the missing number in an array 1-100

# walk the array..
# keep an expected count
# check ( starting from index 0 ) that expected count is arr[index] 
# if this is false return expected count + 1 as the missing number
# then increment expectedcount

expected_count = 1
for i in range(0,100):
    print(i)
    if arr[i] != expected_count:
        print(expected_count, " my output...")
        break
    expected_count += 1

print("expected... " , removed_num)


print(arr)
