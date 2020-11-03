import { Component, OnInit } from '@angular/core';
import { CasosPorMes } from 'src/app/components/casosPorMes/casosPorMes.model';
import { CasosPorMesService } from 'src/app/components/casosPorMes/casosPorMes.service';

@Component({
  selector: 'app-dados',
  templateUrl: './dados.component.html',
  styleUrls: ['./dados.component.css']
})
export class DadosComponent implements OnInit {

 
casosPorMes: CasosPorMes[]
displayedColumns = ['id', 'mes', 'casos']


  constructor( private casosPorMesService: CasosPorMesService) { }

  ngOnInit(): void {
    this.casosPorMesService.read().subscribe(casosPorMes => {
      this.casosPorMes = casosPorMes
    })
  }

}
