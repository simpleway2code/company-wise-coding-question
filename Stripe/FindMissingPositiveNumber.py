
"""
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0]
should give 3.

You can modify the input array in-place.

"""

# example of Solution

from typing import List


def findMissingPositiveNumber(listNumber: List[int]) -> int:

    for i in range(len(listNumber)):
        if listNumber[i] < 0:
            listNumber[i] = 0

    maxValue = max(listNumber)
    minValue = min(listNumber)

    if minValue != 0 and minValue > 1:
        return 1

    for index in range(len(listNumber)):
        if listNumber[index] == maxValue:
            currentLastValue = listNumber[-1]
            currentValue = listNumber[index]
            listNumber[-1] = currentValue
            listNumber[index] = currentLastValue

        if listNumber[index] == minValue:
            currentLastValue = listNumber[0]
            currentValue = listNumber[index]
            listNumber[0] = currentValue
            listNumber[index] = currentLastValue

    previousIndex = len(listNumber) - 2

    for index in range(1, len(listNumber)-1):
        if listNumber[index] > len(listNumber) and previousIndex > index:
            currentValue = listNumber[index]
            numberToswap = listNumber[previousIndex]
            listNumber[previousIndex] = currentValue
            listNumber[index] = numberToswap
            previousIndex -= 1

        if len(listNumber) > listNumber[index] > 0:
            currentLastValue = listNumber[index]
            numberToswap = listNumber[currentLastValue]
            listNumber[currentLastValue] = currentLastValue
            listNumber[index] = numberToswap

    for index in range(len(listNumber)):
        if index != listNumber[index]:
            return index

    return len(listNumber)


if __name__ == "__main__":
    print(findMissingPositiveNumber([3, 4, -1, 1]))
    print(findMissingPositiveNumber([1, 2, 0]))
    print(findMissingPositiveNumber([16, 0, 18, 1, 3, 21]))
