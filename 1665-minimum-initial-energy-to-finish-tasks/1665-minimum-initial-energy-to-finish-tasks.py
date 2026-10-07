class Solution:
    def minimumEffort(self, tasks: list[list[int]]) -> int:
        tasks.sort(key=lambda x:x[1]-x[0], reverse=True)
        print(tasks)
        res=tasks[0][1]
        rem=res-tasks[0][0]
        n=len(tasks)
        for i in range(1,n):
            if rem<tasks[i][1]:
                v=tasks[i][1]-rem
                res+=v
                rem+=v
                print("v:",v)
            rem=rem-tasks[i][0]
            print("res:",res," rem:",rem)
        return res