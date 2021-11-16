import { ServiceService } from './../../../Servicios/service.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Estudiante } from '../../estudiante/estudiante';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  Estudiantes:Estudiante[] = [];
  constructor(private router:Router, private servicio:ServiceService) { }

  ngOnInit(): void {
  }

  NuevoDato(){
    this.router.navigate(['insertar'])
  }

  ModificarDato(){
    this.router.navigate(['modificar'])
  }

  EliminarDato(){
    this.router.navigate(['eliminar'])
  }
}
