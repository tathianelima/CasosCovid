import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs'; 
import { CasosPorMes } from './casosPorMes.model';

@Injectable({
  providedIn: 'root'
})

export class CasosPorMesService {

  baseUrl = "http://localhost:8080/casosPorMes"

  constructor( private http: HttpClient) { 
  }

  read(): Observable<CasosPorMes[]> {
      return this.http.get<CasosPorMes[]>(this.baseUrl)
  }
}
