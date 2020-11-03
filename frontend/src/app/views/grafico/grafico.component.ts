import { Component, OnInit } from '@angular/core';
import { CasosPorMes } from 'src/app/components/casosPorMes/casosPorMes.model';
import { CasosPorMesService } from 'src/app/components/casosPorMes/casosPorMes.service';
import { Chart } from 'chart.js';

@Component({
  selector: 'app-grafico',
  templateUrl: './grafico.component.html',
  styleUrls: ['./grafico.component.css']
})
export class GraficoComponent implements OnInit {

  casosPorMes: CasosPorMes[]
  mes = []
  casos = []
  chart = []

  constructor( private casosPorMesService: CasosPorMesService) { }

  ngOnInit(): void {
      this.casosPorMesService.read().subscribe((res: CasosPorMes[]) => {
        res.forEach(y => {
          this.mes.push(y.mes);
          this.casos.push(y.casos);
        });
        this.chart = new Chart('canvas', {
          type: 'line',
          data: {
            labels: this.mes,
            datasets: [
              {
                data: this.casos,
                borderColor: '#3cba9f',
                label: "Número de Infectados ",
                fill: false
              }
            ]
          },
          options: {
            legend: {
              display: true
            },
            scales: {
              xAxes: [{
                display: true
              }
            ],
              yAxes: [{
                display: true,
                stacked: true
              }],
            }
          }
        });
      });
  }
}
