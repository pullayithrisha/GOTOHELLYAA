CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        select distinct salary from (
            select salary, DENSE_RANK() OVER (ORDER by salary desc) as rnk from Employee
        ) nthhigh
        where rnk=N
  );
END