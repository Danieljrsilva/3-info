USE classicmodels;

/*DELIMITER inicio do procedimento*/
/*VALUES==valores do insert*/
/*So sera executado quando for chamado*/
/*Cria uma procedure, sem parametros e sem retorno
Sintaxe:
DELIMITER $$
CREATE PROCIDURE nome-DA-procedure()
BEGIN
   ...
END $$
*/
DELIMITER $$
CREATE PROCEDURE primeiraProcedure()
BEGIN
	INSERT INTO produtos(ID_produto, nome_produto, ID_categoria)
	VALUES('2019-p4', 'teste', 'Motorcycles');


SELECT * FROM produtos;
END $$/*fim do procedimento*/

#executa a procedure
CALL primeiraProcedure();

#=========================================================================
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
#=========================================================================
/*DELIMITER inicio do procedimento*/
/*VALUES==valores do insert*/
/*So sera executado quando for chamado*/
/*Cria uma procedure,  com parametros e sem retorno
Sintaxe:
DELIMITER $$
CREATE PROCIDURE nome-da-procedure(IN parametro TIPO)

IN = ENTRADA

BEGIN
   ...
END $$
*/
/*DELIMITER inicio do procedimento*/
DELIMITER $$
CREATE PROCEDURE qtdMaiorQue(IN quantidade INT)
BEGIN
	SELECT * FROM produtos
	WHERE qtd_em_estoque >= quantidade;
END $$/*fim do procedimento*/

#executa a procedure, passando o inteiro 3000 como parâmetro
CALL qtdMaiorQue(3000);

#=========================================================================
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
#=========================================================================

/*DELIMITER inicio do procedimento*/
/*COUNT==conta as linhas*/
/*So sera executado quando for chamado*/
/*Cria uma procedure, sem  parametros e com retorno
Sintaxe:
DELIMITER $$
CREATE PROCIDURE nome-da-procedure(OUT parametro TIPO)

OUT = SAIDA

BEGIN
   ...
END $$
*/
/*DELIMITER inicio do procedimento*/
DELIMITER $$
CREATE PROCEDURE qtdProdutos(OUT quantidade INT)
BEGIN
	SELECT COUNT(*) INTO quantidade FROM produtos;
END $$/*fim do procedimento*/

#executa a procedure, retornando a quantidade de produtos
CALL qtdProdutos(@quantidade);
SELECT @quantidade;

#=========================================================================
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
#=========================================================================

/*DELIMITER inicio do procedimento*/
/*COUNT==conta as linhas*/
/*So sera executado quando for chamado*/
/*Cria uma procedure, com  parametros e com retorno
Sintaxe:
DELIMITER $$
CREATE PROCIDURE nome-da-procedure(INOUT parametro TIPO)

INOUT = entrada e saida

BEGIN
   ...
END $$
*/
/*DELIMITER inicio do procedimento*/
DELIMITER $$
CREATE PROCEDURE numAoQuadrado(INOUT numero INT)
BEGIN
	SET numero = numero * numero;
END $$/*fim do procedimento*/

#executa a procedure,passando um parâmetro e retornando o resultado de produtos 
SET @num = 5;
CALL numAoQuadrado(@num);
SELECT @num AS 'Resultado';

#=========================================================================
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
#=========================================================================
/*Cria uma procedure com if e else < 1000 -> Nivel critico(compre!) 
>1000 && < 5000 OK(show de bola!) > 5000 Nivel alto(venda em promoção!)*/

#THEN = entao
DELIMITER $$
CREATE PROCEDURE nivelEstoque(IN id VARCHAR(250))
BEGIN
	SET @qtd = (SELECT qtd_em_estoque FROM produtos WHERE ID_produto = id);
	
	IF(@qtd < 1000) THEN 
		SELECT 'Nivel baixo(commpre!)' AS 'Nivel';
		
	ELSEIF(@qtd >= 1000 AND @qtd <= 5000) THEN
		SELECT 'Nivel OK' AS 'Nivel';
		
	ELSE
		SELECT 'Nivel alto(venda)' AS 'Nivel';
		
	END IF;
END $$

#--------------------------------------------------------------------------------
#S12_1099 | S12_1108 | S10_4698 |
CALL nivelEstoque('S12_1099');
CALL nivelEstoque('S12_1108');
CALL nivelEstoque('S10_4698');

#=========================================================================
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
#=========================================================================



 