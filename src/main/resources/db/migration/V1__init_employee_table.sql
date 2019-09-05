CREATE TABLE employee (
  id INTEGER PRIMARY KEY ,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);
CREATE TABLE package (
  id VARCHAR(64) PRIMARY KEY,
  bookingNumber VARCHAR(64) NOT NULL,
  name VARCHAR(64) NOT NULL,
  phone VARCHAR(64) NOT NULL,
  status VARCHAR(1) default '1',
  bookingDate DATE default current_timestamp ,
  weight   int(4)
);
