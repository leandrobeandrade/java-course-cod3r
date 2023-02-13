package modelos.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private int qtde;
	
	@Column(nullable = false)
	private Double preco;
	
	@ManyToOne
	private Pedido pedido;
	
	// O fetch tem a ver onde fecha a conexão
	// esse é o valor default de fetch (...ToOne -> EAGER)
	@ManyToOne(fetch = FetchType.EAGER)
	private Produto produto;
	
	public ItemPedido() {
	}

	public ItemPedido(Pedido pedido, Produto produto, int qtde) {
		super();
		this.setQtde(qtde);
		this.setPedido(pedido);
		this.setProduto(produto);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		
		if (produto != null && this.preco == null) {
			this.setPreco(produto.getPreco());
		}
	}
	
}
