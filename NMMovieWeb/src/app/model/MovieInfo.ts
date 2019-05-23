import {Rating} from './Rating';

export class MovieInfo {


  private title: string;
  private year: string;
  private rated: string;
  private released: string;
  private runtime: string;
  private genre: string;

  private director: string;

  private writer: string;

  private actors: string;

  private plot: string;

  private language: string;

  private country: string;

  private awards: string;

  private poster: string;

  private metascore: string;

  private imdbRating: string;

  private imdbVotes: string;

  private imdbID: string;

  private type: string;
  private dVD: string;
  private boxOffice: string;
  private production: string;
  private website: string;
  private response: string;

  private ratings: Array<Rating>;




    public getTitle(): string {
      return this.title;
    }

    public setTitle(title: string) {
    this.title = title;
  }

  public getYear(): string {
    return this.year;
  }

  public setYear(year: string) {
    this.year = year;
  }

  public getRated(): string {
    return this.rated;
  }

  public setRated(rated: string) {
    this.rated = rated;
  }

  public getReleased(): string {
    return this.released;
  }

  public setReleased(released: string) {
    this.released = released;
  }

  public getRuntime(): string {
    return this.runtime;
  }

  public setRuntime(runtime: string) {
    this.runtime = runtime;
  }

  public getGenre(): string {
    return this.genre;
  }

  public setGenre(genre) {
    this.genre = genre;
  }

  public getDirector(): string {
    return this.director;
  }

  public setDirector(director) {
    this.director = director;
  }

  public getWriter(): string {
    return this.writer;
  }

  public setWriter(writer) {
    this.writer = writer;
  }

  public getActors(): string {
    return this.actors;
  }

  public setActors(actors) {
    this.actors = actors;
  }

  public getPlot(): string {
    return this.plot;
  }

  public setPlot(plot) {
    this.plot = plot;
  }

  public getLanguage(): string {
    return this.language;
  }

  public setLanguage(language: string) {
    this.language = language;
  }

  public getCountry(): string {
    return this.country;
  }

  public setCountry(country) {
    this.country = country;
  }

  public getAwards(): string {
    return this.awards;
  }

  public setAwards(awards) {
    this.awards = awards;
  }

  public getPoster(): string {
    return this.poster;
  }

  public setPoster(poster) {
    this.poster = poster;
  }

  public  getRatings(): Array<Rating> {
    return this.ratings;
  }

  public setRatings(ratings: Array<Rating>) {
    this.ratings = ratings;
  }

  public getMetascore(): string {
    return this.metascore;
  }

  public setMetascore(metascore: string) {
    this.metascore = metascore;
  }

  public getImdbRating(): string {
    return this.imdbRating;
  }

  public setImdbRating(imdbRating) {
    this.imdbRating = imdbRating;
  }

  public getImdbVotes(): string {
    return this.imdbVotes;
  }

  public setImdbVotes(imdbVotes: string) {
    this.imdbVotes = imdbVotes;
  }

  public getImdbID(): string {
    return this.imdbID;
  }

  public setImdbID(imdbID: string) {
    this.imdbID = imdbID;
  }

  public getType(): string {
    return this.type;
  }

  public setType(type: string) {
    this.type = type;
  }

  public getDVD(): string {
    return this.dVD;
  }

  public setDVD(dVD) {
    this.dVD = dVD;
  }

  public getBoxOffice(): string {
    return this.boxOffice;
  }

  public setBoxOffice(boxOffice: string) {
    this.boxOffice = boxOffice;
  }

  public getProduction(): string {
    return this.production;
  }

  public setProduction(production) {
    this.production = production;
  }

  public getWebsite(): string {
    return this.website;
  }

  public setWebsite(website: string) {
    this.website = website;
  }

  public getResponse(): string {
    return this.response;
  }

  public setResponse(response: string) {
    this.response = response;
  }

}
