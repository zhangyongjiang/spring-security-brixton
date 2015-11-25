create table if not exists Kick (id varchar(64) primary key, created bigint, updated bigint, version integer, json text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin);

create table if not exists i_Kick_userId_startTime_endTime(id varchar(64),userId varchar(64),startTime bigint,endTime bigint, created bigint);

alter table i_Kick_userId_startTime_endTime add  index ii_Kick_userId_startTime_endTime(userId,startTime,endTime);

alter table i_Kick_userId_startTime_endTime add index idindex (id);

