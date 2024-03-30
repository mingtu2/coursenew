drop table if exists chapter;
create table chapter(
  id char(8) not null comment 'ID',
  course_id char(8) comment '课程ID',
  name varchar(50) comment '名称',
  primary key(id)
)ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

insert into chapter values(1007,8,'微积分');