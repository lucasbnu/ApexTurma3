export class clientes{
    id_cliente?: number;	
	nome_cliente:String;  
    idade: number; 
    ativo: number;
    constructor(nome_cliente:String, idade:number, ativo:number){
        this.nome_cliente = nome_cliente;
        this.idade = idade;
        this.ativo = ativo;
    }
}