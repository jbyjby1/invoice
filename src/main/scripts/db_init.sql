CREATE DATABASE IF NOT EXISTS invoice DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use invoice;

create table if not exists payment_days(
    uuid varchar(64),
	  name varchar(64),
    description varchar(256),
    start_time timestamp null,
    end_time timestamp null,
    primary key(uuid)
)