-- CONCATENATING OUTPUTS
SELECT FROM city;
SELECT FROM park

-- All city names and their state abbreviation.
SELECT cit_name, state_abbreviation FROM city

-- The all parks by name and date established.
SELECT (park_name ||'-'|| date_established) FROM park;



-- The census region and state name of all states in the West & Midwest sorted in ascending order.



-- SUBQUERIES

-- List all cities in the western census region
SELECT city_name,state_abbreviation
FROM city
WHERE state_abbreviation IN(SELECT state_abbreviation FROM state WHERE census_region = 'West')
;

-- List all cities in states with "garden" in their nickname

SELECT *
FROM city
WHERE state_abbreviation IN(SELECT state_abbreviation FROM state WHERE state_nickname ILIKE '%garden%') 
-- Get the parks with the smallest and largest areas
SELECT park_name, area
FROM park
WHERE area = (SELECT MIN(area) FROM park)
OR area = (SELECT MAX(area) FROM park)

-- Get the state name and census region for all states with a national park
SELECT state_name, census_Region 
FROM state
WHERE state_abbreviation IN (SELECT state_abbreviation FROM park_state)

-- Subqueries aren't limited to WHERE clauses, can appear in SELECT list (must return only 1 result)
SELECT count(population) 
FROM city
WHERE POPULATION > 100000000
-- Include state name rather than the state abbreviation while counting the number of cities in each state,
--   ordered from most cities to least.



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.


-- Total population in the West and South census regions


-- The number of cities with populations greater than 1 million


-- The number of state nicknames.


-- The area of the smallest and largest parks.



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT count(city_name) AS city_count, state_abbreviation FROM city
GROUP BY state_abbreviation
ORDER BY city_count DESC


-- Determine the average park area depending upon whether parks allow camping or not.
SELECT has_camping, AVG(area)
FROM park
GROUP BY has_camping

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation


-- The smallest city population in each state ordered by city population.

