alter table book add column bestseller_list_id int;
alter table book add foreign key book_bestseller_fk(bestseller_list_id) references bestseller_list(id) on delete cascade;