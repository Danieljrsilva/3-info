USE classicmodels;

#1========================================================
SELECT *
FROM funcionario 
LEFT JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio
LIKE escritorios.ID_escritorio = 'San Francisco';
#=========================================================

#2=======================================================
SELECT * FROM clientes
RIGHT JOIN pagamentos
ON clientes.ID_cliente = 103;
#========================================================

#3=======================================================
SELECT venda.*, CONCAT (nome, sobrenome ) AS 'Nome Completo', telefone, CONCAT (endereco_linha1, " ", endereco_linha2) AS 'Endereço', cidade, estado, codigo_postal
FROM clientes
INNER JOIN venda ON clientes.ID_cliente = venda.ID_cliente;
#========================================================

#4=======================================================
SELECT funcionario.*, escritorios.cidade as 'escritorio'
FROM funcionario 
INNER JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio;
#========================================================

#5=======================================================
SELECT clientes.*,CONCAT(funcionario.nome,' ', funcionario.sobrenome) AS'Representante' 
FROM clientes
INNER JOIN funcionario ON clientes.ID_representante_vendas = funcionario.ID_funcionario 
WHERE funcionario.sobrenome LIKE  '%firrelli%' ;
#===========================================================

#6============================================================

#=============================================================



SELECT * FROM clientes; 
SELECT * FROM escritorios;