import { Component } from '@angular/core';
import { ApiService } from '../../servicios/api/api.service'
import { Router } from '@angular/router'
import { ListaEmprendimientosI } from '../../modelos/listaemprendimientos.interface'

@Component({
  selector: 'app-emprendimientos',
  templateUrl: './emprendimientos.component.html',
  styleUrls: ['./emprendimientos.component.css']
})
export class EmprendimientosComponent {

  emprendimientos:ListaEmprendimientosI[]=[];

  constructor (private api:ApiService, private router:Router) { }

  ngOnInit(): void {
    this.api.getAllEmprendimientos().subscribe(data => {
      this.emprendimientos= data;
      console.log(data)
    })
  }

}

