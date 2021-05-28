select b.rn, b.employee_id, b.first_name
  from (select rownum as rn, a.employee_id, a.first_name
          from (select employee_id, first_name
                  from employees
                 order by hire_date)a)b
 where b.rn between 11 and 20;

-- a : 정렬한 테이블
-- b : a 테이블에 rn을 추가한 테이블
select employee_id, first_name
  from employees;
 