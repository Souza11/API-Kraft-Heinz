create table insights(

    id bigint not null auto_increment,
    nomeCliente varchar(100) not null,
    email varchar(100) not null,
    nomeProduto varchar(100) not null,
    tipo varchar(100) not null,
    proposta varchar(100) not null unique,

    primary key (id)



);