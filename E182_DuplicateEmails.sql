/* Write your T-SQL query statement below 
using self-join
*/

select Distinct P.Email as Email from Person P
inner join Person Pe
on P.Email = Pe.Email
where P.Id != Pe.Id;
