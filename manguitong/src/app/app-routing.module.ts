import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './vistas/login/login.component'
import { DashboardComponent } from './vistas/dashboard/dashboard.component'
import { EditarComponent } from './vistas/editar/editar.component'
import { NuevoComponent } from './vistas/nuevo/nuevo.component'
import { EmprendimientosComponent } from './vistas/emprendimientos/emprendimientos.component'
import { CategoriasComponent } from './vistas/categorias/categorias.component'
import { AuthGuard } from './auth.guard';

const routes: Routes = [
  {path: "", redirectTo:'login', pathMatch: "full"},
  {path: "login", component: LoginComponent},
  {path: "dashboard", component: DashboardComponent},
  {path: "editar/:id", component: EditarComponent, canActivate:[AuthGuard]}, //asi se protege una ruta
  {path: "nuevo", component: NuevoComponent},
  {path: "emprendimientos", component: EmprendimientosComponent},
  {path: "categorias", component: CategoriasComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [LoginComponent, DashboardComponent, NuevoComponent, EditarComponent, CategoriasComponent, EmprendimientosComponent]
