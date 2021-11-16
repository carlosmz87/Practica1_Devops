
import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Servicios/service.service';
import { Estudiante } from '../../estudiante/estudiante';

@Component({
  selector: 'app-insertar',
  templateUrl: './insertar.component.html',
  styleUrls: ['./insertar.component.css']
})
export class InsertarComponent implements OnInit {
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
