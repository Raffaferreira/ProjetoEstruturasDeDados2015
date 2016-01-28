public class No {

	private Cliente conteudo;
	private No esquerdo;
	private No direito;

	public Cliente getConteudo() {
		return conteudo;
	}

	public void setConteudo(Cliente conteudo) {
		this.conteudo = conteudo;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}

	public No(Cliente conteudo) {
		this.conteudo = conteudo;
	}

	public void inserirNO(Cliente novoConteudo) {
		if (novoConteudo.getId() < this.conteudo.getId()) {
			if (this.esquerdo != null) {
				esquerdo.inserirNO(novoConteudo);
			} else {
				esquerdo = new No(novoConteudo);
			}
		}

		if (novoConteudo.getId() > this.conteudo.getId()) {
			if (this.direito != null) {
				direito.inserirNO(novoConteudo);
			} else {
				direito = new No(novoConteudo);
			}
		}
	}

	public boolean existeNO(Cliente conteudo) {

		if (conteudo == this.conteudo) {
			return true;
		}

		if (conteudo.getId() < this.conteudo.getId()) {
			if (this.esquerdo == null) {
				return false;
			} else {
				return esquerdo.existeNO(conteudo);
			}
		}

		if (conteudo.getId() > this.conteudo.getId()) {
			if (this.direito == null) {
				return false;
			} else {
				return direito.existeNO(conteudo);
			}
		}

		return false;
	}
	
	public Integer getGrau(){
		Integer grau = 0;
		
		if (esquerdo != null)
		{
			grau += 1 + esquerdo.getGrau();
		}
		if(direito != null)
		{
			grau += 1 + direito.getGrau();
		}
		return grau;
	}

}
