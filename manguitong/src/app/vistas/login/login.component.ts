import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'
import { ApiService } from '../../servicios/api/api.service'
import { LoginI } from '../../modelos/login.interface'
import { ResponseI } from '../../modelos/response.interface'
import { Router } from '@angular/router'
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  
  loginForm = new FormGroup({
    usuario : new FormControl('', Validators.required),
    password : new FormControl('', Validators.required)
  })

  constructor( private api:ApiService, private router:Router, private loginService:LoginService) { }

  ngOnInit(): void {
    if (localStorage.getItem("currentuser")){ //aca habria que preguntar por el token que es lo que estaba pero esta dentro de un JSON
      this.router.navigate(['dashboard'])
    }

  }

  onLogin(form: any){ //no me deja que sea LoginI
    this.api.loginByUser(form).subscribe(data => {
      console.log(data)
      let dataResponse:ResponseI = data;
      if (dataResponse){
        //localStorage.setItem("token", dataResponse.token)
        this.loginService.setUserLoggedIn(dataResponse);//cambie la linea de arriba por esta
        this.router.navigate(['dashboard'])
      } else {
        console.log(dataResponse);
      }
    });
  }

}
