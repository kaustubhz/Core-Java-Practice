USE javadb;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS courses;
CREATE TABLE IF NOT EXISTS courses(
course_id INTEGER PRIMARY KEY  AUTO_INCREMENT,
name VARCHAR(20) unique,
fees DECIMAL(9,2),
strt_date DATE,
end_date DATE
);


CREATE TABLE IF NOT EXISTS student(
student_id INTEGER PRIMARY KEY AUTO_INCREMENT,
student_name VARCHAR(20),
student_email VARCHAR(20) UNIQUE,
student_address VARCHAR(20),
dob DATE,
marks INTEGER,
course_id INTEGER,
CONSTRAINT fk1 FOREIGN KEY (course_id) REFERENCES courses (course_id)
);

INSERT INTO courses(name,fees,strt_date,end_date) 
VALUES ("DAC",90000,'2019-05-01','2019-09-01'),
("DBDA",95000,'2019-01-01','2019-05-01'),
("DITISS",85000,'2019-07-01','2019-11-01'),
("IOT",80000,'2019-04-04','2019-08-04'),
("AI",110000,'2019-08-01','2019-12-01');

INSERT INTO student(student_name,student_email,student_address,dob,marks,course_id)
VALUES ("Ram","ram@gmail.com","Pune",'1996-05-15',75,4),
("Ram","ram@gmail.com","Pune",'1996-05-15',75,4),
("Shyam","shyam@gmail.com","Mumbai",'1996-07-17',75,4),
("Radhe","radhe@gmail.com","Delhi",'1996-12-12',75,4),
