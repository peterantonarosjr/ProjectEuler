def findMultiples(targetNum):

    multSum = 0

    for i in range(1,targetNum):
        if(i%3==0 or i%5==0):
            multSum+=i

    print(multSum)


findMultiples(10)
