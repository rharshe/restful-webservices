insert into user values(10001,sysDate(),'AB');
insert into user values(10002,sysDate(),'Jill');
insert into user values(10003,sysDate(),'Jam');
insert into post values(11001,'My first post',10001);
insert into post values(11002,'My second post',10001);

insert into todo(id,username,description,target_date,is_done)
values(20001,'rahul','learn jpa',sysdate(),false);
insert into todo(id,username,description,target_date,is_done)
values(20002,'rahul','learn angular',sysdate(),false);
insert into todo(id,username,description,target_date,is_done)
values(20003,'rahul','learn spring',sysdate(),false);