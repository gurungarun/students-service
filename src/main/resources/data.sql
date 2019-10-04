
DROP TABLE IF EXISTS students;
  
CREATE TABLE Students (
  
   userId int not null primary key auto_increment,
  name VARCHAR(250) NOT NULL,
   address VARCHAR(250),
  age int (25)
);

INSERT INTO Students  VALUES
  ('0101','Aliko', 'Dc', 45),
  ('0122','Bill', 'md', 22),
  ('3432','Folrunsho', 'pa', 21);