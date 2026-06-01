package com.example.aprender.ui.model

data class Curso(
    val id:Int,
    val nome: String,
    val nomeBreve: String,
    val categoria: String,
    val nivel:String,
    val cargaHoraria:Int,
    val descricaoCurta:String,
    val descricaoLonga:String,
    val statusDisponibilidade: Status,
    val percentualProgresso:Double

)

fun exemplo(){
    val cursoExemplo = listOf(
        Curso(
            id = 1,
            nome = "Desenvolvimento Android com Jetpack Compose",
            nomeBreve = "Android Compose",
            categoria = "Mobile",
            nivel = "Intermediário",
            cargaHoraria = 60,
            descricaoCurta = "Crie interfaces modernas para Android usando Compose.",
            descricaoLonga = "Aprenda a construir aplicativos Android do zero com Jetpack Compose, gerenciamento de estado, navegação e integração com APIs REST.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 0.0
        ),
        Curso(
            id = 2,
            nome = "Lógica de Programação para Iniciantes",
            nomeBreve = "Lógica Prog.",
            categoria = "Programação",
            nivel = "Básico",
            cargaHoraria = 20,
            descricaoCurta = "Fundamentos de lógica para quem está começando na área.",
            descricaoLonga = "Curso introdutório sobre algoritmos, fluxogramas, estruturas de decisão e repetição. Ideal para quem nunca programou antes.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 75.0
        ),
        Curso(
            id = 3,
            nome = "Banco de Dados com SQL e PostgreSQL",
            nomeBreve = "SQL Avançado",
            categoria = "Banco de Dados",
            nivel = "Intermediário",
            cargaHoraria = 40,
            descricaoCurta = "Domine consultas SQL e administração de bancos relacionais.",
            descricaoLonga = "Aprenda desde comandos básicos até consultas complexas com joins, subqueries, views, procedures e otimização de performance com PostgreSQL.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 100.0
        ),
        Curso(
            id = 4,
            nome = "Desenvolvimento Web com React",
            nomeBreve = "React Web",
            categoria = "Web",
            nivel = "Intermediário",
            cargaHoraria = 50,
            descricaoCurta = "Construa aplicações web modernas com React e hooks.",
            descricaoLonga = "Curso completo de React cobrindo componentes, hooks, context API, consumo de APIs e deploy de aplicações em produção.",
            statusDisponibilidade = Status.EM_BREVE,
            percentualProgresso = 0.0
        ),
        Curso(
            id = 5,
            nome = "Python para Ciência de Dados",
            nomeBreve = "Python Data",
            categoria = "Data Science",
            nivel = "Avançado",
            cargaHoraria = 80,
            descricaoCurta = "Análise e visualização de dados com Python e suas bibliotecas.",
            descricaoLonga = "Explore pandas, numpy, matplotlib e scikit-learn para análise exploratória, machine learning e criação de dashboards interativos.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 30.0
        ),
        Curso(
            id = 6,
            nome = "Redes de Computadores",
            nomeBreve = "Redes",
            categoria = "Infraestrutura",
            nivel = "Básico",
            cargaHoraria = 35,
            descricaoCurta = "Conceitos fundamentais de redes, protocolos e segurança.",
            descricaoLonga = "Entenda como funcionam as redes de computadores, modelo OSI, TCP/IP, roteamento, switches, DNS, DHCP e fundamentos de segurança de rede.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 50.0
        ),
        Curso(
            id = 7,
            nome = "DevOps com Docker e Kubernetes",
            nomeBreve = "DevOps K8s",
            categoria = "DevOps",
            nivel = "Avançado",
            cargaHoraria = 70,
            descricaoCurta = "Automatize deploys com containers e orquestração.",
            descricaoLonga = "Aprenda a containerizar aplicações com Docker, orquestrar com Kubernetes, configurar pipelines CI/CD e monitorar ambientes em produção.",
            statusDisponibilidade = Status.INDISPONIVEL,
            percentualProgresso = 0.0
        ),
        Curso(
            id = 8,
            nome = "UI/UX Design para Aplicativos",
            nomeBreve = "UX Mobile",
            categoria = "Design",
            nivel = "Básico",
            cargaHoraria = 25,
            descricaoCurta = "Projete interfaces intuitivas e acessíveis para apps.",
            descricaoLonga = "Aprenda os princípios de design centrado no usuário, prototipagem com Figma, testes de usabilidade e boas práticas de acessibilidade mobile.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 10.0
        ),
        Curso(
            id = 9,
            nome = "Kotlin para Desenvolvimento Android",
            nomeBreve = "Kotlin Android",
            categoria = "Mobile",
            nivel = "Básico",
            cargaHoraria = 45,
            descricaoCurta = "Aprenda Kotlin do zero e crie seus primeiros apps Android.",
            descricaoLonga = "Domine a linguagem Kotlin com foco em desenvolvimento Android: sintaxe, orientação a objetos, coroutines, e criação de apps com Views e XML.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 0.0
        ),
        Curso(
            id = 10,
            nome = "Segurança da Informação e Ethical Hacking",
            nomeBreve = "Sec. Info",
            categoria = "Segurança",
            nivel = "Avançado",
            cargaHoraria = 90,
            descricaoCurta = "Técnicas de segurança ofensiva e defensiva para sistemas.",
            descricaoLonga = "Aprenda sobre vulnerabilidades, testes de penetração, criptografia, OWASP Top 10, análise de malware e como proteger sistemas e redes corporativas.",
            statusDisponibilidade = Status.EM_BREVE,
            percentualProgresso = 0.0
        ),
        Curso(
            id = 11,
            nome = "Desenvolvimento de APIs REST com Spring Boot",
            nomeBreve = "Spring Boot",
            categoria = "Back-end",
            nivel = "Intermediário",
            cargaHoraria = 55,
            descricaoCurta = "Crie APIs robustas e escaláveis com Spring Boot e Java.",
            descricaoLonga = "Construa APIs REST completas com Spring Boot, JPA, autenticação JWT, documentação Swagger, testes unitários e deploy em nuvem.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 60.0
        ),
        Curso(
            id = 12,
            nome = "Git e GitHub para Trabalho em Equipe",
            nomeBreve = "Git & GitHub",
            categoria = "Ferramentas",
            nivel = "Básico",
            cargaHoraria = 15,
            descricaoCurta = "Controle versões e colabore em projetos com Git.",
            descricaoLonga = "Aprenda os comandos essenciais do Git, fluxo de trabalho com branches, pull requests, resolução de conflitos e boas práticas em repositórios GitHub.",
            statusDisponibilidade = Status.DISPONIVEL,
            percentualProgresso = 100.0
        )
    )
}