import { Component, OnInit } from '@angular/core';
import { CasosPorMes } from '../casosPorMes.model';
import { CasosPorMesService } from '../casosPorMes.service';
import { Chart } from 'chart.js';

@Component({
  selector: 'app-casosPorMes-chart',
  templateUrl: './casosPorMes-chart.component.html',
  styleUrls: ['./casosPorMes-chart.component.css']
})
export class CasosPorMesChartComponent implements OnInit {


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