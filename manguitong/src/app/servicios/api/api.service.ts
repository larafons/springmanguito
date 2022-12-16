
import { Injectable } from '@angular/core';
import { LoginI } from '../../modelos/login.interface'
import { ResponseI } from '../../modelos/response.interface'
import { ListaEmprendimientosI } from '../../modelos/listaemprendimientos.interface'
import { ListaCategoriasI } from '../../modelos/listacategorias.interface'
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  
  url:string = "http://localhost:8080/ttps-spring/";

  constructor(private http: HttpClient) { }

  loginByUser(form: LoginI):Observable<ResponseI> {
    let direccion = this.url+"auth"
    return this.http.post<ResponseI>(direccion, form);
  }

  getAllEmprendimientos():Observable<ListaEmprendimientosI[]>{
    let direccion = this.url+"emprendimientos"
    return this.http.get<ListaEmprendimientosI[]>(direccion);
  }

  getAllCategorias():Observable<ListaCategoriasI[]>{
    let direccion = this.url+"categorias"
    return this.http.get<ListaCategoriasI[]>(direccion);
  }

  getSingleCat(id: any):Observable<ListaCategoriasI>{
    let direccion= this.url+"categorias/"+id
    return this.http.get<ListaCategoriasI>(direccion)
  }
}
