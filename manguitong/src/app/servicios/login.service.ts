import { Injectable } from '@angular/core';
import { ResponseI } from '../modelos/response.interface';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private isUserLoggedIn;
  public userLogged: ResponseI;

  constructor() {
    this.isUserLoggedIn = false;
  }
  isLogged() {
    return this.isUserLoggedIn;
  }
  setUserLoggedIn(user: ResponseI) {
    this.isUserLoggedIn = true;
    this.userLogged = user;
    localStorage.setItem('currentUser', JSON.stringify(user));

  }
  getUserLoggedIn() {
    return JSON.parse(localStorage.getItem('currentUser'));
  }

  getToken(){
    return this.isLogged ? this.getUserLoggedIn().token : null;
  }

  logOut(){
    localStorage.removeItem('currentUser');
    this.isUserLoggedIn = false;
    this.userLogged = null;
  }
}
