-- =========================================
-- Oracle Setup for Spring Boot tblStudent API
-- =========================================

-- 1. Create sequence for auto-generated student IDs
CREATE SEQUENCE student_seq
    START WITH 200
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- 2. (Optional) Create table if it doesn't exist yet
--    Since spring.jpa.hibernate.ddl-auto=update, JPA will create it automatically.
--    But here's the DDL just in case:
/*
CREATE TABLE tblStudent (
    student_id    NUMBER PRIMARY KEY,
    first_name    VARCHAR2(100),
    last_name     VARCHAR2(100),
    enrolled_date DATE
);
*/

-- 3. Verify sequence
SELECT student_seq.NEXTVAL FROM dual;

COMMIT;
