import { Component, OnInit } from '@angular/core';
import { clientes } from './clientes';
import { ClientesService } from './clientes.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

   listaClientes?: clientes[];
   erro = '';
   sucesso = '';

  constructor(private ClientesService: ClientesService) { }

  ngOnInit(): void {
    this.obterClientes();
  }

  obterClientes():void{
    this.ClientesService.getClientes().subscribe(
      (retorno) => {
        this.listaClientes = retorno;
        this.sucesso = 'Clientes obtidos com sucesso';
      },
      (e) => {
        this.erro = e;
      }
    );
  }

}
