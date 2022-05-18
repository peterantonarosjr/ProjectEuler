fibList = []

fibList.append(0)
fibList.append(1)
fibList.append(2)

targetFib = 10


def printEvenFibSum(fibList,targetFib):
    fibSum = 0

    for i in range(3,targetFib+1):
        fibList.append(fibList[i-1]+fibList[i-2])

    for j in range(2,len(fibList),2):
        fibSum+=fibList[j]

    print(fibSum)


printEvenFibSum(fibList,targetFib)
