import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Servicios/service.service';
import { Estudiante } from '../../estudiante/estudiante';

@Component({
  selector: 'app-eliminar',
  templateUrl: './eliminar.component.html',
  styleUrls: ['./eliminar.component.css']
})
export class EliminarComponent implements OnInit {
  Estudiante:Estudiante = {
    Id: 0,
    Nombre: "",
    Telefono: 0,
    Edad: 0,
    Correo: ""
  }
  constructor(private servicio:ServiceService) { }

  ngOnInit(): void {
  }

}
