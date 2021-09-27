USE classicmodels;

#Funcionário e o escritorio
#Sintaxe do INNER JOIN
#SELECT <campos> FROM TABELA_A
#INNER JOIN TABELA_B
# ON #A.chave_primaria = b.chave_estrangeira
SELECT * FROM  funcionario INNER JOIN escritorios ON funcionario.ID_escritorio = escritorios.ID_escritorio;

#============================================================================================================
SELECT funcionario.ID_funcionario, funcionario.nome,
funcionario.email, escritorios.cidade as 'cidade do escritorio'
FROM funcionario 
INNER JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio;

#============================================================================================================
SELECT f.ID_funcionario, f.nome,
f.email, e.cidade as 'cidade do escritorio'
FROM funcionario f 
INNER JOIN escritorios e 
ON f.ID_escritorio = e.ID_escritorio;

#============================================================================================================
#SELECT funcionario.ID_funcionario, funcionario.nome,
#funcionario.email, escritorios.cidade as 'cidade do escritorio'
SELECT funcionario.*
FROM funcionario 
LEFT JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio
WHERE escritorios.ID_escritorio = 1;

#OU
SELECT funcionario.*, escritorios.cidade
FROM funcionario 
LEFT JOIN escritorios 
ON funcionario.ID_escritorio = escritorios.ID_escritorio
WHERE escritorios.cidade LIKE 'S%';

#============================================================================================================
#---INNER JOIN----
SELECT * FROM venda
INNER JOIN clientes
ON clientes.ID_cliente = venda.ID_cliente;

#---LEFT JOIN----
SELECT * FROM venda
LEFT JOIN clientes
ON clientes.ID_cliente = venda.ID_cliente;

#---RIGHT JOIN----
SELECT * FROM venda
RIGHT JOIN clientes
ON clientes.ID_cliente = venda.ID_cliente;




SELECT * FROM funcionario
