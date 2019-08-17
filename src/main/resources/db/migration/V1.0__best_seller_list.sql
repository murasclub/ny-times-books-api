CREATE TABLE IF NOT EXISTS bestseller_list (
    id int auto_increment primary key,
    list_name varchar(255) not null,
    display_name varchar(255) not null,
    list_name_encoded varchar(255) not null,
    oldest_published_date date not null,
    newest_published_date date not null,
    updated varchar(255)
)