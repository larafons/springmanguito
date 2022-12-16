import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'
import { ApiService } from '../../servicios/api/api.service'
import { LoginI } from '../../modelos/login.interface'
import { ResponseI } from '../../modelos/response.interface'
import { Router } from '@angular/router'

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

  constructor( private api:ApiService, private router:Router) { }

  ngOnInit(): void {

  }

  onLogin(form: any){ //no me deja que sea LoginI
    this.api.loginByUser(form).subscribe(data => {
      console.log(data)
      let dataResponse:ResponseI = data;
      if (dataResponse.result == "OK"){
        //almacena token local storage
        //lo comento pq no tenemos token todav
        //localStorage.setItem("token", dataResponse.result.token)
        //no se por q no entra aca, debe haber problema de respuestas
        console.log("entra a la respuesta")
        this.router.navigate(['dashboard'])
      }
    });
  }

}
