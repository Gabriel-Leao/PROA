export interface IContent {
  slug?: String,
  title: String,
  items: any
}

export interface ItemInfo {
  backdrop_path: string,
  genres: [
    {
      id: number
      name: string
    }
  ],
  original_title: string,
  id: number,
  overview: string,
  poster_path: string,
  name: string,
  vote_average: number,
  number_of_seasons: number,
  first_air_date: string,
  title: string
}

export interface IFeatured {
  item: ItemInfo
}

export interface IButton {
  href: string,
  children: string
}