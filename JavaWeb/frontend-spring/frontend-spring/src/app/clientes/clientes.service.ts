import { Injectable } from "@angular/core";
import { HttpClient,HttpErrorResponse,HttpParams } from "@angular/common/http";
import { clientes } from "./clientes"; 
import { Observable,throwError } from "rxjs";
import { map, catchError } from "rxjs/operators";


@Injectable({
    providedIn: "root"
})

export class ClientesService {
    urlProjeto = "http://192.168.1.19:8090/clientes/buscar";
    constructor(private http: HttpClient) { }
   
    listaClientes?: clientes[];
    falha(e: HttpErrorResponse): Observable<any> {
        console.log(e.error);
        return throwError("Erro ao buscar clientes");
     }

    getClientes(): Observable<clientes[]> {
        return this.http.get<clientes[]>(this.urlProjeto).pipe(
            map((retorno) => {
                this.listaClientes = retorno;
                return this.listaClientes;
            }),
            catchError(this.falha)
        );
    }
}

