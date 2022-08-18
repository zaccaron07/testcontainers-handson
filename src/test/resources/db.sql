CREATE TABLE public.token (
	id_token numeric(10) NOT NULL,
	status varchar(32) NOT NULL,
	token_ref varchar(256) NOT NULL,
	last4 varchar(4) NOT NULL,
	CONSTRAINT token_pkey PRIMARY KEY (id_token)
);
