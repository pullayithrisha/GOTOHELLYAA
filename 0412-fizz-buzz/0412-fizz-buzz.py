class Solution:
    def fizzBuzz(self, n: int) -> list[str]:
        res=[]
        for i in range(n):
            idx=i+1
            if idx%3==0 and idx%5==0:
                res.append("FizzBuzz")
            elif idx%3==0:
                res.append("Fizz")
            elif idx%5==0:
                res.append("Buzz")
            else:
                res.append(str(i+1))
        return res