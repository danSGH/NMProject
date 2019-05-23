export class Rating {

    private source: string;

    private value: string;

    public getSource(): string {
      return this.source;
    }

    public setSource(source: string) {
    this.source = source;
  }

  public getValue(): string {
    return this.value;
  }

  public setValue(value: string) {
    this.value = value;
  }
}

