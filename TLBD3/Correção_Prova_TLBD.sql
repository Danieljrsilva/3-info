#1
SELECT ID_cliente, UPPER(nome) FROM clientes WHERE cidade = 'NYC'

#2
SELECT *,CONCAT(nome,SPACE(1),sobrenome) as 'Nome Completo',
telefone,
CONCAT(endereco_linha1,',',SPACE(1),endereco_linha2)
as 'endereco',
cidade,pais
FROM clientes WHERE pais = 'Australia'

#3
SELECT * FROM escritorios WHERE ISNULL(estado);

#4
SELECT * FROM clientes WHERE CHARACTER_LENGTH(nome) = 6;
SELECT * FROM clientes WHERE CHAR_LENGTH(nome) = 6;
SELECT * FROM clientes WHERE LENGTH(nome) = 6;

#Retirando os espaços
SELECT * FROM clientes WHERE CHAR_LENGTH(RTRIM(nome)) = 6;

#5
SELECT * FROM clientes WHERE limite_credito = (SELECT MAX(limite_credito) FROM clientes);

#6
SELECT * FROM clientes WHERE limite_credito = (SELECT MIN(limite_credito) FROM clientes);

#7
SELECT ROUND(AVG(limite_credito),1) as 'Media: limite de credito' FROM clientes;

#8
SELECT 
LEFT(nome_produtos,4) as 'ano',
SUBSTRING(nome_produtos,5) as 'modelo',
descricao_produto
FROM produtos WHERE ID_categoria = 'Motorcycles';

#9
SELECT ID_produto, nome_produto, ID_categoria, escala_produto,
productVendor, descricao_produto, qtd_em_estoque,
ROUND(preco_compra,1), ROUND(preco_venda,1)
FROM produtos;

#10
SELECT COUNT(cargo) as 'Qtd de vendedores'
FROM funcionario WHERE cargo = 'Sales Rep'

#11