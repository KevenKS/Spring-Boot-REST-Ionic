package com.keven.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.keven.cursomc.domain.Categoria;
import com.keven.cursomc.domain.Cidade;
import com.keven.cursomc.domain.Cliente;
import com.keven.cursomc.domain.Endereco;
import com.keven.cursomc.domain.Estado;
import com.keven.cursomc.domain.ItemPedido;
import com.keven.cursomc.domain.Pagamento;
import com.keven.cursomc.domain.PagamentoComBoleto;
import com.keven.cursomc.domain.PagamentoComCartao;
import com.keven.cursomc.domain.Pedido;
import com.keven.cursomc.domain.Produto;
import com.keven.cursomc.domain.enums.EstadoPagamento;
import com.keven.cursomc.domain.enums.TipoCliente;
import com.keven.cursomc.repositories.CategoriaRepository;
import com.keven.cursomc.repositories.CidadeRepository;
import com.keven.cursomc.repositories.ClienteRepository;
import com.keven.cursomc.repositories.EnderecoRepository;
import com.keven.cursomc.repositories.EstadoRepository;
import com.keven.cursomc.repositories.ItemPedidoRepository;
import com.keven.cursomc.repositories.PagamentoRepository;
import com.keven.cursomc.repositories.PedidoRepository;
import com.keven.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		
	}		
}
