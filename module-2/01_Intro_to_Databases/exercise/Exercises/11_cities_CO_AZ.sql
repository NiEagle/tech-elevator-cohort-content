-- 11. The name, state, and population of all cities in Colorado (CO) or Arizona (AZ).
-- Order the results by state abbreviation alphabetically (A-Z), then by populatuon (highest first).
-- (22 rows)

SELECT city_name, state_abbreviation, population
FROM city
WHERE state_abbreviation = 'AZ' OR state_abbreviation = 'CO'
ORDER BY state_abbreviation ,population DESC;
