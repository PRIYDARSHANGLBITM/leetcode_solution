SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 = 1
  AND rating > 3
  and description != "boring"
ORDER BY rating DESC;
