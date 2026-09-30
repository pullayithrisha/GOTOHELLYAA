class Solution:
    def categorizeBox(self, l: int, w: int, h: int, m: int) -> str:
        v=l*w*h
        heavy=""
        bulky=""
        if m>=100:
            heavy="Heavy"
        lim=10**4
        if l>=lim or w>=lim or h>=lim or v>=10**9:
            bulky="Bulky"
        if bulky!="" and heavy!="":
            return "Both"
        if bulky=="" and heavy=="":
            return "Neither"
        if bulky!="" and heavy=="":
            return "Bulky"
        else:
            return "Heavy"

