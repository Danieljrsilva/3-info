USE classicmodels;

#===================CORREÇÃO===============================

#1=================================================================
SELECT *
FROM funcionario 
LEFT JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio
WHERE escritorios.cidade LIKE 'San Francisco';
#================================================================


#2==============================================================
SELECT * FROM pagamentos
RIGHT JOIN clientes
ON clientes.ID_cliente = pagamentos.ID_cliente
WHERE pagamentos.ID_cliente = 103;
#=================================================================



#3=================================================================
SELECT venda.*, clientes.ID_cliente, 
CONCAT(clientes.nome,SPACE(1),clientes.sobrenome) AS 'Nome Completo',
CONCAT(clientes.endereco_linha1,SPACE(1),clientes.endereco_linha2) 
AS 'Endereço',clientes.telefone,clientes.cidade,clientes.estado,clientes.codigo_postal
FROM venda
INNER JOIN clientes ON venda.ID_cliente = clientes.ID_cliente;

#==============EXEMPLO==============================================

SELECT v.*, c.ID_cliente, 
CONCAT(c.nome,SPACE(1),c.sobrenome) AS 'Nome Completo',
CONCAT(c.endereco_linha1,SPACE(1),c.endereco_linha2) 
AS 'Endereço',c.telefone,c.cidade,c.estado,c.codigo_postal
FROM venda v
INNER JOIN clientes c ON v.ID_cliente = c.ID_cliente;
#=================================================================



#4===============================================================
SELECT funcionario.*, escritorios.cidade as 'escritorio'
FROM funcionario 
INNER JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio;
#=================================================================



#5==================================================================
SELECT * FROM clientes
INNER JOIN funcionario 
ON clientes.ID_representante_vendas = funcionario.ID_funcionario
WHERE funcionario.sobrenome = 'Firrelli';
#====================================================================

#6========================DESAFIO====================================
SELECT *, ROUND	(preco_compra / preco_venda * 100) AS 'lucro(%)' FROM produtos;
#===========================================================




SELECT * FROM clientes; 
SELECT * FROM escritorios;