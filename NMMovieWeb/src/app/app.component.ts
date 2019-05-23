import {AfterViewInit, Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders, HttpResponse} from '@angular/common/http';
import {MovieInfo} from './model/MovieInfo';
import {Observable} from 'rxjs';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MatPaginator, MatSort, MatTableDataSource} from '@angular/material';
import {TVSeriesInfoData} from './model/TVSeriesInfoData';
import {Episode} from './model/Episode';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  @ViewChild(MatSort) sort: MatSort;

  titles = 'NM TV Series Search';

  titleSearch: FormControl;
  seasonSearch: FormControl;

  apiURL = 'http://localhost:8080/tv/title/';

  formGroup: FormGroup;

  tvSeriesInfo: TVSeriesInfoData;

  displayedColumns: string[] = ['Title', 'Released', 'Episode', 'imdbID'];

  dataSource: MatTableDataSource<Episode>;

  constructor(private http: HttpClient) {
    const episodes: Episode[] = [];
    this.dataSource = new MatTableDataSource(episodes);
  }

  ngOnInit() {
    this.formGroup = new FormGroup({
      titleSearch: new FormControl('Seinfeld'),
      seasonSearch: new FormControl('1'),
      filter: new FormControl(''),
    });
    this.dataSource.sort = this.sort;
  }

  private getTvSeriesInfo(): Observable < any > {
    return this.http.get(this.apiURL + this.formGroup.controls.titleSearch.value + '/season/' + this.formGroup.controls.seasonSearch.value);
  }

  search() {
    this.clear();
    this.getTvSeriesInfo().subscribe(tvSeriesInfoData => {
      this.tvSeriesInfo = JSON.parse(JSON.stringify(tvSeriesInfoData));
      let episodes: Episode[] = [];
      episodes = this.tvSeriesInfo.episode;
      this.dataSource = new MatTableDataSource(tvSeriesInfoData.Episodes);
    });
  }

  clear() {
    this.tvSeriesInfo = null;
    this.dataSource = new MatTableDataSource();
  }

  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

}
