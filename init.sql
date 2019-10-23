use mysql;
CREATE TABLE test_db (
  id int(11) NOT NULL AUTO_INCREMENT,
  test varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into test_db (test) values('Jiabo.Wu');