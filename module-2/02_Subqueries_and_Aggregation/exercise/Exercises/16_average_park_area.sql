-- 16. The average area of national parks that have camping. Name the column 'average_park_area'.
-- Expected answer is around 3,900.
-- (1 row)

SELECT avg(area) AS average_park_area
FROM park
WHERE has_camping IS TRUE AND park_id IN (SELECT park_id FROM park_state)
