import { EliminarComponent } from './Componentes/componentes/eliminar/eliminar.component';
import { ModificarComponent } from './Componentes/componentes/modificar/modificar.component';
import { InsertarComponent } from './Componentes/componentes/insertar/insertar.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'insertar',component:InsertarComponent},
  {path:'modificar', component:ModificarComponent},
  {path:'eliminar', component:EliminarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
