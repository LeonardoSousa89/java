package arrow;

public class Elements {
		
	 	protected int codigo;
		protected String name;
		protected String endereco;
		
		public Elements() {}

		public Elements(int codigo, String name, String endereco) {
			super();
			this.codigo = codigo;
			this.name = name;
			this.endereco = endereco;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + codigo;
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
			Elements other = (Elements) obj;
			if (codigo != other.codigo)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "dados:"
					+ "codigo:" 
					+ codigo 
					+ ", name:" 
					+ name 
					+ ", endereco:" 
					+ endereco;
		}
		
		
}
