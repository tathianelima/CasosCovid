import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/template/header/header.component';
import { MatToolbarModule} from '@angular/material/toolbar';
import { FooterComponent } from './components/template/footer/footer.component';
import { NavComponent } from './components/template/nav/nav.component';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { HomeComponent } from './views/home/home.component';
import { DadosComponent } from './views/dados/dados.component';
import { GraficoComponent } from './views/grafico/grafico.component';
import { CasosPorMesComponent } from './components/casosPorMes/casosPorMes.component';
import { HttpClientModule } from '@angular/common/http';
import { CasosPorMesReadComponent } from './components/casosPorMes/casosPorMes-read/casosPorMes-read.component';
import { MatTableModule } from '@angular/material/table';
import { CasosPorMesChartComponent } from './components/casosPorMes/casosPorMes-chart/casosPorMes-chart.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    HomeComponent,
    DadosComponent,
    GraficoComponent,
    CasosPorMesComponent,
    CasosPorMesReadComponent,
    CasosPorMesChartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    HttpClientModule,
    MatTableModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
