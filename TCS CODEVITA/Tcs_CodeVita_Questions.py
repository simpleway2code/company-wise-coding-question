#Question:

"""
The parcel section of the Head Post Office is in a mess. The parcels that need to be loaded to the vans have been lined up in a row in an arbitrary order of weights. The Head Post Master wants them to be sorted in the increasing order of the weights of the parcels, with one exception. He wants the heaviest (and presumably the most valuable) parcel kept nearest his office.

You and your friend try to sort these boxes and you decide to sort them by interchanging two boxes at a time. Such an interchange needs effort equal to the product of the weights of the two boxes.

The objective is to reposition the boxes as required with minimum effort.

Input Format:

The first line consists of two space-separated positive integers giving the number of boxes (N) and the position of the Head Post Masters office (k) where the heaviest box must be.
The second line consists of N space-separated positive integers giving the weights of the boxes. You may assume that no two weights are equal
Output Format:

The output is one line giving the total effort taken to get the boxes in sorted order, and the heaviest in position k.
Constraints:

 N<=50 and Weights <= 1000

Sample Input 1:
5 2
20 50 30 80 70
Sample Output 1:
3600
"""

#Solution:

size,k = map(int,input().split())
parcel = list(map(int,input().split()))
effort = 2*parcel[k-1]*min(parcel) + max(parcel)*min(parcel)
print(effort)