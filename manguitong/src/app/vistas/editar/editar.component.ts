import { Component } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ListaCategoriasI } from '../../modelos/listacategorias.interface';
import { ApiService } from '../../servicios/api/api.service'
import { FormGroup, FormControl, Validators } from '@angular/forms'

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent {

  constructor (private activatedroute: ActivatedRoute, private router:Router, private api:ApiService) {  }

  datosCategoria: ListaCategoriasI;
  editarForm= new FormGroup ({
    nombre: new FormControl('')
    //aca iria el token tambien
  });

  ngOnInit(): void {
    let categoriaid = this.activatedroute.snapshot.paramMap.get('id');
    this.api.getSingleCat(categoriaid).subscribe(data => {
      let datosCat= data;
      console.log(datosCat.nombre+" nombreeee")
      this.editarForm.setValue({
        'nombre': datosCat.nombre
      })
    })
    console.log(this.editarForm.value)
  }

  //para mandar token asi editar se verifica ver a partir de minuto 4 video 10 tutorial

}
