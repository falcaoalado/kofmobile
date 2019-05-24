CREATE TABLE personagem (
		id			BIGINT(10)						PRIMARY KEY AUTO_INCREMENT,
		nome		VARCHAR(30)						NOT NULL,
		tipo		ENUM('GANK', 'TANK', 'DPS')		NOT NULL,
		imagem		VARCHAR(255)					NOT NULL,
		aptitude	TINYINT							NOT NULL,
		ataque		INT								NOT NULL,
		defesa		INT								NOT NULL,
		hp			INT								NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

INSERT INTO personagem VALUES (
null,
'Zero',
'TANK',
'http://www.arcadequartermaster.com/kof01/boss_zero.png',
14,
1000,
1500,
2000
);