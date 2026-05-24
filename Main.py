def quickSort(arr):
    if len(arr)<=1:
        return arr;
    pivot=arr[0];
    left=[];
    right=[];
    equal=[];
    
    for x in arr:
        if x<pivot:
            left.append(x);
        elif x>pivot:
            right.append(x);
        else:
            equal.append(x);
    return quickSort(left)+equal+quickSort(right);

arr=[4,3,2,1];
print(quickSort(arr));
