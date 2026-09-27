class Solution:
    def reverseParentheses(self, s: str) -> str:
        res=""
        st=[]
        for i in s:
            if i.isalpha() or i=='(':
                st.append(i)
            else:
                v=""
                while st and st[-1]!='(':
                    v+=st.pop()
                if st:
                    st.pop()
                # v=v[::-1]
                for j in v:
                    st.append(j)
                print(v)
        while st:
            res+=st.pop()
        res=res[::-1]
        return res