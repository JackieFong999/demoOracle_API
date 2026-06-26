-- =========================================
-- View: vwTeacher_Class
-- Shows student assignments to classes
-- =========================================

CREATE OR REPLACE VIEW vwTeacher_Class AS
SELECT 
    s.student_id,
    s.first_name,
    s.last_name,
    c.class_id,
    c.class_name
FROM tblStudent s
JOIN tblEnrollment e ON s.student_id = e.student_id
JOIN tblClass c ON e.class_id = c.class_id;

COMMIT;
