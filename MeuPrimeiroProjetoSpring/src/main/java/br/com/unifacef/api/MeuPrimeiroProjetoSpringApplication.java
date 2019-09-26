package br.com.unifacef.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import br.com.unifacef.api.entities.Empresa;
import br.com.unifacef.api.entities.Funcionario;
import br.com.unifacef.api.repositories.EmpresaRepository;
import br.com.unifacef.api.repositories.FuncionarioRepository;

@SpringBootApplication
public class MeuPrimeiroProjetoSpringApplication {
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private FuncionarioRepository funcionarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Empresa empresa = new Empresa();
			empresa.setRazaoSocial("Depto de Computação");
			empresa.setCnpj("456");
			this.empresaRepository.save(empresa);
			
			List<Empresa> empresas = empresaRepository.findAll();
			empresas.forEach(System.out::println);

			Empresa empresaDb = empresaRepository.findById(1L).orElse(null);
			System.out.println("Empresa por ID: " + empresaDb);

			empresaDb.setRazaoSocial("Uni-FACEF Centro Universitário");
			this.empresaRepository.save(empresaDb);

			Empresa empresaCnpj = empresaRepository.findByCnpj("123");
			System.out.println("Empresa por CNPJ: " + empresaCnpj);

			this.empresaRepository.delete(empresaCnpj);
			empresas = empresaRepository.findAll();
			empresas.forEach(System.out::println);
			
			Funcionario funcionario = new Funcionario();
			funcionario.setNome("Vitor Araújo Oliveira");
			funcionario.setCpf("4383480809");
			funcionario.setEmail("vitor.araujo934@hotmail.com");
			
			float qtdHorasAlmoco = 1;
			funcionario.setQtdHorasAlmoco(qtdHorasAlmoco);
			
			float qtd_horas_trabalho = 8;
			
			funcionario.setQtdHorasTrabalhoDia(qtd_horas_trabalho);
			
			
			this.funcionarioRepository.save(funcionario);
			

			List<Funcionario> funcionarios = funcionarioRepository.findAll();
			empresas.forEach(System.out::println);

			Funcionario funcionariodb = funcionarioRepository.findById(1L).orElse(null);
			System.out.println("Empresa por ID: " + funcionariodb);

			empresaDb.setRazaoSocial("Uni-FACEF Centro Universitário");
			this.funcionarioRepository.save(funcionariodb);
			
//			Funcionario funcionarioCPF = funcionarioRepository.findByCPF("43836480809");
//			System.out.println("Funcionario por CPF: " + funcionarioCPF);

// 			this.funcionarioRepository.delete(funcionarioCPF);
			funcionarios = funcionarioRepository.findAll();
			funcionarios.forEach(System.out::println);
			
		};
	}
}