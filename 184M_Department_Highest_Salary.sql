With dept as(
select D.Name as Department, E.Name as Employee, E.Salary as Salary,
DENSE_RANK() OVER (PARTITION BY DepartmentId ORDER BY E.Salary DESC) as rnk_Sal
from Employee E inner join Department D
on E.DepartmentId = D.Id)

select Department, Employee, Salary from dept
where rnk_Sal =1
;
