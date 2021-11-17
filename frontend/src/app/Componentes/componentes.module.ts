import { AppRoutingModule } from './../app-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './componentes/home/home.component';
import {MatButtonModule} from '@angular/material/button';
import {MatTableModule} from '@angular/material/table';
import { InsertarComponent } from './componentes/insertar/insertar.component';
import { ModificarComponent } from './componentes/modificar/modificar.component';
import { EliminarComponent } from './componentes/eliminar/eliminar.component';
import {FormsModule}        from '@angular/forms';

@NgModule({
  declarations: [
    HomeComponent,
    InsertarComponent,
    ModificarComponent,
    EliminarComponent
  ],
  imports: [
    CommonModule,
    AppRoutingModule,
    MatButtonModule,
    MatTableModule,
    FormsModule
  ],
  exports: [
    HomeComponent,
    InsertarComponent,
    ModificarComponent,
    EliminarComponent
  ]
})
export class ComponentesModule { }
