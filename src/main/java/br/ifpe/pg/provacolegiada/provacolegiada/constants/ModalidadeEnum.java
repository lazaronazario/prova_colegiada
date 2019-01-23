package br.ifpe.pg.provacolegiada.provacolegiada.constants;

public enum ModalidadeEnum {
	E("EAD"),P("Presencial");
	
	public String descricao;
	
	ModalidadeEnum(String descricao){
		this.descricao = descricao;
	}
}
