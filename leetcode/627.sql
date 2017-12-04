-- 627. Swap Salary
-- https://leetcode.com/problems/swap-salary/description/
UPDATE salary
SET sex = (
        CASE sex
        WHEN 'm' THEN 'f'
        ELSE 'm' END
    )