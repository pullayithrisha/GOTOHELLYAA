class Solution:
    def longestValidParentheses(self, s: str) -> int:
        st=[]
        st.append(-1)
        n=len(s)
        res=0
        cm=0
        for i in range(n):
            if s[i]=='(':
                st.append(i)
            else:
                st.pop()
                if not st:
                    st.append(i)
                else:
                    m=i-st[-1]
                    res=max(res,m)
        return res

            