create table personal_policy (
                                 id int8 generated by default as identity,
                                 finish date,
                                 object varchar(255),
                                 owner varchar(255),
                                 start date,
                                 primary key (id)
)
