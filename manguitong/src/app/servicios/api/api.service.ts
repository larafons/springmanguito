
import { Injectable } from '@angular/core';
import { LoginI } from '../../modelos/login.interface'
import { ResponseI } from '../../modelos/response.interface'
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  
  url:string = "http://localhost:8080/ttps-spring/";

  constructor(private http: HttpClient) { }

  loginByUser(form: LoginI):Observable<ResponseI> {
    let direccion = this.url+"emprendedores/login"
    return this.http.post<ResponseI>(direccion, form);
  }
}
