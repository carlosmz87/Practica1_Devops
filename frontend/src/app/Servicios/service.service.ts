import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Estudiante } from '../Componentes/estudiante/estudiante';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  apiURL = 'http://localhost:3000/api';
  constructor(private http:HttpClient) { }
 

  getEstudiantes():Observable<Estudiante[]>{
    return this.http.get<Estudiante[]>(this.apiURL + '/alumnos');
  }

  NewEstudiante(estudiante:Estudiante):Observable<Estudiante>{
    return this.http.post<Estudiante>(this.apiURL+'/add', estudiante);
  }

  ModificarEstudiante(id:number, estudiante:Estudiante):Observable<Estudiante>{
    return this.http.put<Estudiante>(this.apiURL+'/modificar/'+id , estudiante);
  }
  
  EliminarEstudiante(id:number){
    return this.http.delete<Estudiante>(this.apiURL+'/delete/'+id);
  }

}
