CREATE TABLE TVendedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    dsemail VARCHAR(255) NOT NULL
);

CREATE TABLE TVenda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255),
    valor DECIMAL(10, 2),
    idVendedor INT,
    FOREIGN KEY (idVendedor) REFERENCES TVendedor(id)
);
