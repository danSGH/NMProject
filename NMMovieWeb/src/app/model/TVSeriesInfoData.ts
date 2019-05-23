import {Episode} from "./Episode";

export class TVSeriesInfoData {

  public title: string;


  public season: string;


  public totalSeasons: string;


  public episode: Array<Episode>;


  public response: string;


  public getTitle(): string {
    return this.title;
  }

  public setTitle(title: string) {
    this.title = title;
  }

  public getSeason(): string {
    return this.season;
  }

  public setSeason(season : string) {
    this.season = season;
  }

  public getTotalSeasons(): string {
    return this.totalSeasons;
  }

  public setTotalSeasons(totalSeasons: string) {
    this.totalSeasons = totalSeasons;
  }

  public  getEpisode(): Array<Episode> {
    return this.episode;
  }

  public setEpisode( episode: Array<Episode>) {
    this.episode = episode;
  }

  public getResponse(): string {
    return this.response;
  }

  public setResponse(response) {
    this.response = response;
  }

}
