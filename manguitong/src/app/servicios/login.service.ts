import { Injectable } from '@angular/core';
import { ResponseI } from '../modelos/response.interface';
import { BehaviorSubject, Observable } from 'rxjs';

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
  isValidToken(){
    let token = this.getToken();
    if (token) {
      let payload = JSON.parse(atob(token.split(".")[1]));
      if (payload.exp > new Date().getTime()/1000) {
        return true;
      }
    }
    return false;
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
    //console.log(localStorage.getItem('currentUser'));
    this.isUserLoggedIn = false;
    this.userLogged = null;
  }
}
