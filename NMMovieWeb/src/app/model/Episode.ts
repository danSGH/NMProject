export class Episode {
  private title: string;

  private released: string;

  private episode: string;

  private imdbRating: string;

  private imdbID: string;

  public getTitle(): string {
    return this.title;
  }

  public setTitle(title: string) {
    this.title = title;
  }

  public getReleased(): string {
    return this.released;
  }

  public setReleased(released: string) {
    this.released = released;
  }

  public getEpisode(): string {
    return this.episode;
  }

  public setEpisode(episode: string) {
    this.episode = episode;
  }

  public getImdbRating(): string {
    return this.imdbRating;
  }

  public setImdbRating(imdbRating: string) {
    this.imdbRating = imdbRating;
  }

  public getImdbID(): string {
    return this.imdbID;
  }

  public setImdbID(imdbID: string) {
    this.imdbID = imdbID;
  }

}
