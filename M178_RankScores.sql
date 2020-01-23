select Score, Rank
from (
select Score,
Dense_rank() over (order by score desc) as Rank
from Scores) r;
