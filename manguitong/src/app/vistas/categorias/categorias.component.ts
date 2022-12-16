import { Component } from '@angular/core';
import { ApiService } from '../../servicios/api/api.service'
import { Router } from '@angular/router'
import { ListaCategoriasI } from '../../modelos/listacategorias.interface'

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.css']
})
export class CategoriasComponent {

  categorias:ListaCategoriasI[]=[];

  constructor (private api:ApiService, private router:Router) { }

  ngOnInit(): void {
    this.api.getAllCategorias().subscribe(data => {
      this.categorias= data;
    })
  }

  editarCategoria(id: number){
    this.router.navigate(['editar', id])
  }

  nuevaCategoria(){
    this.router.navigate(['nuevo']);
  }

}
