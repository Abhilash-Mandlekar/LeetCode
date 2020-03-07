/* Write your T-SQL query statement below */

with cte (Id1, Student1, Id2, Student2)as ((select * from seat s1 
left join seat s2
on S1.ID  = S2.ID - 1 and s2.Id % 2 = 0
WHERE S1.ID % 2 != 0 )
union all
(select * from seat s1 
left join seat s2
on S1.ID  = S2.ID + 1 and s1.Id % 2 = 0
WHERE S2.ID IS NOT NULL))


select Id1 as Id, 
case 
When Student2 IS NULL THEN Student1
ELSE Student2
End as student 
from cte order by Id1;

