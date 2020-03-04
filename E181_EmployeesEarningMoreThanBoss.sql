/* self join the table */

Select Em.Name as Employee from Employee E
left join Employee Em
on E.Id = Em.ManagerId
where Em.Salary > E.Salary;
