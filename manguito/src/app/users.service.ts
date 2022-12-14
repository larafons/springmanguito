import { Injectable } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs/Observable";

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http: HttpClient) {}

  login(user: any): Observable<any> {
    return this.http.post("http://localhost:8080/ttps-spring/emprendedores/login", user);
  }
  signin(user: any): Observable<any> {
    return this.http.post("http://localhost:8080/ttps-spring/emprendedores", user);
  }

}
