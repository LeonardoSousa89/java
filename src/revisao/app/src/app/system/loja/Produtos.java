package app.system.loja;

import app.system.operacao.Operacoes;

public class Produtos implements Operacoes{
	
	private String item;
	private long codigo;
	private int qtde;
	private double preco;
	
	public Produtos() {
		
	}
	
	public Produtos(String item, long codigo, int qtde, double preco) {
		this.item = item;
		this.codigo = codigo;
		this.qtde = qtde;
		this.preco = preco;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public Double total(int qtde, double preco) {
		this.qtde = qtde;
		this.preco = preco;
		
		double totalAPagar = this.qtde * this.preco;
		//System.out.println(totalAPagar + "R$");
		return totalAPagar;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qtde;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		if (codigo != other.codigo)
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (qtde != other.qtde)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "item:" 
				+ item 
				+ ", codigo:" 
				+ codigo 
				+ ", qtde:" 
				+ qtde 
				+ ", preco:" 
				+ preco;
	}
		
}
