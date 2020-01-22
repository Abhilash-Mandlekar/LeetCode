SELECT(
ISNULL(
(SELECT DISTINCT Salary
FROM (SELECT Salary, DENSE_RANK() OVER (ORDER BY Salary DESC) AS rank
FROM Employee) r
WHERE r.rank = 2), NULL) ) AS SecondHighestSalary;
