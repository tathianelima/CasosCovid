import { Component, OnInit } from '@angular/core';
import { CasosPorMes } from '../casosPorMes.model';
import { CasosPorMesService } from '../casosPorMes.service';

@Component({
  selector: 'app-casosPorMes-read',
  templateUrl: './casosPorMes-read.component.html',
  styleUrls: ['./casosPorMes-read.component.css']
})
export class CasosPorMesReadComponent implements OnInit {

casosPorMes: CasosPorMes[]
displayedColumns = ['id', 'mes', 'casos']


  constructor( private casosPorMesService: CasosPorMesService) { }

  ngOnInit(): void {
    this.casosPorMesService.read().subscribe(casosPorMes => {
      this.casosPorMes = casosPorMes
      console.log(casosPorMes)
    })
  }

}
