package app.system.loja.estoque;

import app.system.loja.Produtos;

public class Mercadorias extends Produtos{

	//higiene 
	String item1 = "sabonete 50g";
	String item2 = "shampoo 90g";
	String item3 = "papel higiênico novo";
	//limpeza
	String item4 = "detergente atol 90ml";
	String item5 = "sabão pó ala 90g";
	String item6 = "limpa aluminio 60ml";
	//laticinios
	String item7 = "leite em pó ninho LT 1kg";
	String item8 = "achocolatado nescau 800g";
	String item9 = "aveia dr.oetker 135g";
	//mesa e banho
	String item10 = "toalha para banho";
	String item11 = "toalha de mesa";
	String item12 = "pano de prato";
	//cereais
	String item13 = "feijão kicaldo 1kg";
	String item14 = "arroz urbano integral";
	String item15 = "milho para galinha";
	//biscoitos e guloseimas
	String item16 = "cream cracker vitarella 400g";
	String item17 = "biscoito recheado amori 90g";
	String item18 = "batata frita cheetos 50g";
	//moda
	String item19 = "camisa polo his m";
	String item20 = "bermuda cha-cha-dum-dum gg";
	String item21 = "camiseta regata mitchell m";
	//eletro e eletrônicos
	String item22 = "computador mac book pro";
	String item23 = "refrigerador electrolux";
	String item24 = "tv samsumg 45' polegadas";
	public Mercadorias() {
		super();
	}

	public Mercadorias(String item, long codigo, int qtde, double preco) {
		super(item, codigo, qtde, preco);
		
	}

	public Mercadorias(String item1, String item2, String item3, String item4, String item5, String item6, String item7,
			String item8, String item9, String item10, String item11, String item12, String item13, String item14,
			String item15, String item16, String item17, String item18, String item19, String item20, String item21,
			String item22, String item23, String item24) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
		this.item11 = item11;
		this.item12 = item12;
		this.item13 = item13;
		this.item14 = item14;
		this.item15 = item15;
		this.item16 = item16;
		this.item17 = item17;
		this.item18 = item18;
		this.item19 = item19;
		this.item20 = item20;
		this.item21 = item21;
		this.item22 = item22;
		this.item23 = item23;
		this.item24 = item24;
	}
	
	public Mercadorias(String item, long codigo, int qtde, double preco,String item1, String item2, String item3, String item4, String item5, String item6, String item7,
			String item8, String item9, String item10, String item11, String item12, String item13, String item14,
			String item15, String item16, String item17, String item18, String item19, String item20, String item21,
			String item22, String item23, String item24) {
		super(item, codigo, qtde, preco);
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
		this.item11 = item11;
		this.item12 = item12;
		this.item13 = item13;
		this.item14 = item14;
		this.item15 = item15;
		this.item16 = item16;
		this.item17 = item17;
		this.item18 = item18;
		this.item19 = item19;
		this.item20 = item20;
		this.item21 = item21;
		this.item22 = item22;
		this.item23 = item23;
		this.item24 = item24;
	}
	
	public String getItem1() {
		 return this.item1;
	 }
	 
	public String getItem2() {
		 return this.item2;
	 }
	
	public String getItem3() {
		 return this.item3;
	 }
	 
	public String getItem4() {
		 return this.item4;
	 }
	 
	public String getItem5() {
		 return this.item5;
	 }
	 
	public String getItem6() {
		 return this.item6;
	 }
	 
	public String getItem7() {
		 return this.item7;
	 }
	 
	public String getItem8() {
		 return this.item8;
	 }

	public String getItem9() {
		 return this.item9;
	 }

	public String getItem10() {
		 return this.item10;
	 }
	 
	public String getItem11() {
		 return this.item11;
	 }
	 
	public String getItem12() {
		 return this.item12;
	 }
	 
	public String getItem13() {
		 return this.item13;
	 }
	 
	public String getItem14() {
		 return this.item14;
	 }
	 
	public String getItem15() {
		 return this.item15;
	 }
	 
	public String getItem16() {
		 return this.item16;
	 }
	 
	public String getItem17() {
		 return this.item17;
	 }
	 
	public String getItem18() {
		 return this.item18;
	 }
	 
	public String getItem19() {
		 return this.item19;
	 }
	 
	public String getItem20() {
		 return this.item20;
	 }
	 
	public String getItem21() {
		 return this.item21;
	 }
	 
	public String getItem22() {
		 return this.item22;
	 }
	 
	public String getItem23() {
		 return this.item23;
	 }
	 
	public String getItem24() {
		 return this.item24;
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((item1 == null) ? 0 : item1.hashCode());
		result = prime * result + ((item10 == null) ? 0 : item10.hashCode());
		result = prime * result + ((item11 == null) ? 0 : item11.hashCode());
		result = prime * result + ((item12 == null) ? 0 : item12.hashCode());
		result = prime * result + ((item13 == null) ? 0 : item13.hashCode());
		result = prime * result + ((item14 == null) ? 0 : item14.hashCode());
		result = prime * result + ((item15 == null) ? 0 : item15.hashCode());
		result = prime * result + ((item16 == null) ? 0 : item16.hashCode());
		result = prime * result + ((item17 == null) ? 0 : item17.hashCode());
		result = prime * result + ((item18 == null) ? 0 : item18.hashCode());
		result = prime * result + ((item19 == null) ? 0 : item19.hashCode());
		result = prime * result + ((item2 == null) ? 0 : item2.hashCode());
		result = prime * result + ((item20 == null) ? 0 : item20.hashCode());
		result = prime * result + ((item21 == null) ? 0 : item21.hashCode());
		result = prime * result + ((item22 == null) ? 0 : item22.hashCode());
		result = prime * result + ((item23 == null) ? 0 : item23.hashCode());
		result = prime * result + ((item24 == null) ? 0 : item24.hashCode());
		result = prime * result + ((item3 == null) ? 0 : item3.hashCode());
		result = prime * result + ((item4 == null) ? 0 : item4.hashCode());
		result = prime * result + ((item5 == null) ? 0 : item5.hashCode());
		result = prime * result + ((item6 == null) ? 0 : item6.hashCode());
		result = prime * result + ((item7 == null) ? 0 : item7.hashCode());
		result = prime * result + ((item8 == null) ? 0 : item8.hashCode());
		result = prime * result + ((item9 == null) ? 0 : item9.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercadorias other = (Mercadorias) obj;
		if (item1 == null) {
			if (other.item1 != null)
				return false;
		} else if (!item1.equals(other.item1))
			return false;
		if (item10 == null) {
			if (other.item10 != null)
				return false;
		} else if (!item10.equals(other.item10))
			return false;
		if (item11 == null) {
			if (other.item11 != null)
				return false;
		} else if (!item11.equals(other.item11))
			return false;
		if (item12 == null) {
			if (other.item12 != null)
				return false;
		} else if (!item12.equals(other.item12))
			return false;
		if (item13 == null) {
			if (other.item13 != null)
				return false;
		} else if (!item13.equals(other.item13))
			return false;
		if (item14 == null) {
			if (other.item14 != null)
				return false;
		} else if (!item14.equals(other.item14))
			return false;
		if (item15 == null) {
			if (other.item15 != null)
				return false;
		} else if (!item15.equals(other.item15))
			return false;
		if (item16 == null) {
			if (other.item16 != null)
				return false;
		} else if (!item16.equals(other.item16))
			return false;
		if (item17 == null) {
			if (other.item17 != null)
				return false;
		} else if (!item17.equals(other.item17))
			return false;
		if (item18 == null) {
			if (other.item18 != null)
				return false;
		} else if (!item18.equals(other.item18))
			return false;
		if (item19 == null) {
			if (other.item19 != null)
				return false;
		} else if (!item19.equals(other.item19))
			return false;
		if (item2 == null) {
			if (other.item2 != null)
				return false;
		} else if (!item2.equals(other.item2))
			return false;
		if (item20 == null) {
			if (other.item20 != null)
				return false;
		} else if (!item20.equals(other.item20))
			return false;
		if (item21 == null) {
			if (other.item21 != null)
				return false;
		} else if (!item21.equals(other.item21))
			return false;
		if (item22 == null) {
			if (other.item22 != null)
				return false;
		} else if (!item22.equals(other.item22))
			return false;
		if (item23 == null) {
			if (other.item23 != null)
				return false;
		} else if (!item23.equals(other.item23))
			return false;
		if (item24 == null) {
			if (other.item24 != null)
				return false;
		} else if (!item24.equals(other.item24))
			return false;
		if (item3 == null) {
			if (other.item3 != null)
				return false;
		} else if (!item3.equals(other.item3))
			return false;
		if (item4 == null) {
			if (other.item4 != null)
				return false;
		} else if (!item4.equals(other.item4))
			return false;
		if (item5 == null) {
			if (other.item5 != null)
				return false;
		} else if (!item5.equals(other.item5))
			return false;
		if (item6 == null) {
			if (other.item6 != null)
				return false;
		} else if (!item6.equals(other.item6))
			return false;
		if (item7 == null) {
			if (other.item7 != null)
				return false;
		} else if (!item7.equals(other.item7))
			return false;
		if (item8 == null) {
			if (other.item8 != null)
				return false;
		} else if (!item8.equals(other.item8))
			return false;
		if (item9 == null) {
			if (other.item9 != null)
				return false;
		} else if (!item9.equals(other.item9))
			return false;
		return true;
	}
	
	
	
}
