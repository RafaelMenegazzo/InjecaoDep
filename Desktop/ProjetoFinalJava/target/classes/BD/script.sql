CREATE TABLE IF NOT EXIST `Cachorro`(
    `codigo` INT NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(45) NOT NULL,
    `sexo` VARCHAR(1) NOT NULL,
    `cor` VARCHAR(45) NOT NULL,
    `Tipo_pelo` VARCHAR(45) NOT NULL,
    `Data_nascimento` VARCHAR(45) NOT NULL,
    `pai` int not null,
    `mae` INT NOT NULL,
    `Peso` DOUBLE NOT NULL,
    `tamanho` DOUBLE NOT NULL,
    `chip` INT NOT NULL;
    
    PRIMARY KEY(codigo);
    FOREIGN KEY(pai) references Pais(codigo_pai) 
    FOREIGN KEY(mae) references Pais(codigo_mae)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXIST `endereco` (
	`Id_rua` INT NOT NULL AUTO_INCREMENT,
	`rua` VARCHAR(50) NOT NULL,
	`bairro` VARCHAR(45) NOT NULL,
	`cidade` VARCHAR(45) NOT NULL, 
	`uf` VARCHAR(2) NOT NULL,
	`num` INT NOT NULL;
	
	PRiMARY KEY(Id_rua);
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `usuario`(
	`id_usuario` INT NOT NULL AUTO_INCREMENT,
	`login` VARCHAR(45) NOT NULL,
	`senha` VARCHAR(45) NOT NULL,
	`tipo_usuario` int NOT NULL,
	
	PRIMARY KEY (id_usuario)

)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `doguinho`(
	`id_dog` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`nome` VARCHAR(45) NOT NULL,
	`Sexo` VARCHAR(1) NOT NULL,
	`cor` VARCHAR(45) NOT NULL,
	`tipo_pelo` VARCHAR(45) NOT NULL,
	`data_nascimento` DATE NOT NULL,
	`raca` VARCHAR(45) NOT NULL,
	`pai` VARCHAR(45) NOT NULL,
	`mae` VARCHAR(45) NOT NULL,
	`dono`VARCHAR(45) NOT NULL, 
	`peso` DECIMAL(4,2) NOT NULL,
	`tamanho` DECIMAL(4,2) NOT NULL,
	 `chip` INT NOT NULL UNIQUE 
) ENGINE = InnoDB



CREATE TABLE IF NOT EXISTS `canil`(
	`id_canil` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`nome_fantasia` VARCHAR(45) NOT NULL,
	`cnpj` VARCHAR(45) NOT NULL,
	`proprietario` VARCHAR(45) NOT NULL,
	`nome_dog` VARCHAR(45) NOT NULL,
	`endereco` INT NOT NULL,
	
) ENGINE = InnoDB;
