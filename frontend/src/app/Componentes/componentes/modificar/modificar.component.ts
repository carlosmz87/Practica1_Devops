import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Servicios/service.service';
import { Estudiante } from '../../estudiante/estudiante';

@Component({
  selector: 'app-modificar',
  templateUrl: './modificar.component.html',
  styleUrls: ['./modificar.component.css']
})
export class ModificarComponent implements OnInit {
  estudiante:Estudiante = {
    nombre: "",
    telefono: 0,
    correo: ""
  }
  id:number = 0;
  constructor(private servicio:ServiceService) { }

  ngOnInit(): void {
  }

  Modificar(){
    this.servicio.ModificarEstudiante(this.id,this.estudiante).subscribe((data:Estudiante)=>{
      console.log(data);
    });
  }
}
