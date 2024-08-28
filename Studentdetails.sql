CREATE TABLE studentdetails (
    id INT,
    name VARCHAR(50),
    dob INT
);

INSERT INTO studentdetails (id, name, dob) VALUES (1, 'aaa', 20000101);
INSERT INTO studentdetails (id, name, dob) VALUES (2, 'nnn', 20000202);
INSERT INTO studentdetails (id, name, dob) VALUES (3, 'ccc', 20000303);

SELECT * FROM studentdetails;
