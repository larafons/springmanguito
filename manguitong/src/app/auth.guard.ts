import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { LoginService } from './servicios/login.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private authService: LoginService, private router: Router) { }
  
  canActivate(){
        
    if(!this.authService.isLogged()) {
      console.log('No estás logueado');
      this.router.navigate(['/']);
      return false;
    }
    return true;
  }
}


