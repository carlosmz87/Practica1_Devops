
import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Servicios/service.service';
import { Estudiante } from '../../estudiante/estudiante';

@Component({
  selector: 'app-insertar',
  templateUrl: './insertar.component.html',
  styleUrls: ['./insertar.component.css']
})
export class InsertarComponent implements OnInit {

  estudiante:Estudiante = {
    nombre: '',
    telefono: 0,
    correo: ''
  }
  constructor(private servicio:ServiceService) { }

  ngOnInit(): void {
  }

  Insertar(){
    this.servicio.NewEstudiante(this.estudiante).subscribe((data:Estudiante)=>{
      console.log(data);
    });
  }
}
