
public class No {

	private Integer conteudo;
	private No esquerdo;
	private No direito;
	
	public Integer getConteudo() {
		return conteudo;
	}
	public void setConteudo(Integer conteudo) {
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
	
	public No(Integer conteudo){
		this.conteudo = conteudo;
	}
	
	public void inserirNO(Integer novoConteudo){
		if( novoConteudo < this.conteudo )
		{
			if( this.esquerdo != null)
			{
				esquerdo.inserirNO(novoConteudo);
			}
			else
			{
				esquerdo = new No(novoConteudo);
			}
		}
		
		if( novoConteudo > this.conteudo )
		{
			if(this.direito != null)
			{
				direito.inserirNO(novoConteudo);
			}
			else
			{
				direito = new No(novoConteudo);
			}
		}	
	}
	
	public boolean existeNO(Integer conteudo){
		
		if (conteudo == this.conteudo)
		{
			return true;
		}
		
		if(conteudo < this.conteudo){
			if(this.esquerdo == null)
			{
				return false;
			}
			else
			{
				return esquerdo.existeNO(conteudo);
			}
		}
		
		if(conteudo > this.conteudo)
		{
			if(this.direito == null)
			{
				return false;
			}
			else
			{
				return direito.existeNO(conteudo);
			}
		}
		
		return false;
	}
	
	
}
