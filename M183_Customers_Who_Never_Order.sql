select C.Name as Customers from Customers C 
left join Orders O
On C.Id = O.CustomerId
where O.CustomerId is NULL;
