import { Estudiante } from './../../estudiante/estudiante';
import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Servicios/service.service';


@Component({
  selector: 'app-eliminar',
  templateUrl: './eliminar.component.html',
  styleUrls: ['./eliminar.component.css']
})
export class EliminarComponent implements OnInit {
  constructor(private servicio:ServiceService) { }

  ngOnInit(): void {
  }

  id:number = 0;

  Borrar(){
    this.servicio.EliminarEstudiante(this.id).subscribe(()=>{
      console.log("REGISTRO ELIMINADO");
    });
  }

}
