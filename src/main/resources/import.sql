insert into Empresas (nome, tamanho, setor, Localizacao_Geografica, Numero_Funcionarios, Tipo_Empresa, cliente) values ('Empresa A', 'PEQUENO', 'RURAL', 'São Paulo', 150, 'SOCIEDADE_SIMPLES', 1 );
insert into Empresas (nome, tamanho, setor, Localizacao_Geografica, Numero_Funcionarios, Tipo_Empresa, cliente) values ('Empresa B', 'GRANDE', 'INDUSTRIAL', 'Rio de Janeiro', 300, 'SOCIEDADE_ANONIMA', 0);
insert into Empresas (nome, tamanho, setor, Localizacao_Geografica, Numero_Funcionarios, Tipo_Empresa, cliente) values ('Empresa C', 'MICRO', 'COMERCIAL', 'Curitiba', 90, 'MICROEMPREENDEDOR_INDIVIDUAL', 1);

insert into Desempenho_Financeiro (receita, lucro, crescimento, id_empresa) values (150000.00, 50000.00, 12.5, 1);
insert into Desempenho_Financeiro (receita, lucro, crescimento, id_empresa) values (300000.00, 120000.00, 25.0, 2);
insert into Desempenho_Financeiro (receita, lucro, crescimento, id_empresa) values (500000.00, 200000.00, 18.0, 3);

insert into Comportamento_Negocios (Interacoes_Plataforma, Frequencia_Uso, feedback, Uso_Recursos_Especificos, id_empresa) values (5, 10, 'Excelente uso dos recursos disponíveis', 'NAO', 1);
insert into Comportamento_Negocios (Interacoes_Plataforma, Frequencia_Uso, feedback, Uso_Recursos_Especificos, id_empresa) values (10, 8, 'A interface precisa de melhorias', 'SIM', 2);
insert into Comportamento_Negocios (Interacoes_Plataforma, Frequencia_Uso, feedback, Uso_Recursos_Especificos, id_empresa) values (2, 9, 'Ótima experiência e suporte', 'SIM', 3);

insert into Historico_Interacoes (Proposta_Negocio, Contrato_Assinado, Feedback_Servicos_Produtos, id_empresa) values ('Proposta para projeto A', 'SIM', 'Serviço excelente e entrega no prazo.', 1);
insert into Historico_Interacoes (Proposta_Negocio, Contrato_Assinado, Feedback_Servicos_Produtos, id_empresa) values ('Proposta para projeto B', 'NAO', 'O produto poderia ter mais funcionalidades.', 2);
insert into Historico_Interacoes (Proposta_Negocio, Contrato_Assinado, Feedback_Servicos_Produtos, id_empresa) values ('Proposta para projeto C', 'SIM', 'Ótima experiência de trabalho.', 3);

insert into Tendencias_Gastos (Ano, Gasto_Marketing, Gasto_Automacao, id_empresa) values (2023, 50000.00, 20000.00, 1);
insert into Tendencias_Gastos (Ano, Gasto_Marketing, Gasto_Automacao, id_empresa) values (2024, 75000.00, 30000.00, 2);
insert into Tendencias_Gastos (Ano, Gasto_Marketing, Gasto_Automacao, id_empresa) values (2025, 60000.00, 25000.00, 3);

insert into role(nome) values('Visualizador');
insert into role(nome) values('Administrador');

insert into usuario(username,password,nome) values('estagio@gmail.com','$2a$12$0TAV3HuJUP6WPKSPU6XB4.ktASGeYiYhlBnR.fq32gQD1Cjpq.JZe','Estagiario');
insert into usuario(username,password,nome) values('leonardo@gmail.com','$2a$12$iVljKROyqPu/mP8v4c6Us.I6Ed9w12Kubb9Eqfk82TvGJJFCT6Od6','Leonardo');

insert into usuario_roles_associacao(id_role,id_usuario) values(1,1);
insert into usuario_roles_associacao(id_role,id_usuario) values(2,2);

