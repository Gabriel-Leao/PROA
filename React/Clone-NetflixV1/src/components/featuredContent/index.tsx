import { IFeatured } from "../../interfaces"
import AddToListButton from "../buttons/addtoListButton"
import WatchButton from "../buttons/watchButton"
import { FeaturedButtons, FeaturedDescription, FeaturedDiv, FeaturedGenres, FeaturedHorizontal, FeaturedInfo, FeaturedName, FeaturedPoints, FeaturedSeasons, FeaturedVertical, FeaturedYear } from "./styles"

const Featured = ({ item }: IFeatured) => {
  const firstYear = new Date(item.first_air_date)
  const genresList = item.genres.map(genre => (
    genre.name
  ))

  return (
    <FeaturedDiv style={{
      backgroundImage: `url(https://image.tmdb.org/t/p/original${item.backdrop_path})`
    }}>
      <FeaturedVertical>
        <FeaturedHorizontal>
          <FeaturedName>{item.name}</FeaturedName>

          <FeaturedInfo>
            <FeaturedPoints>{item.vote_average.toFixed(1).toString()} pontos</FeaturedPoints>
            <FeaturedYear>{firstYear.getFullYear()}</FeaturedYear>
            <FeaturedSeasons>{item.number_of_seasons} temporada{item.number_of_seasons !== 1 && 's'}</FeaturedSeasons>
          </FeaturedInfo>

          <FeaturedDescription>{item.overview}</FeaturedDescription>

          <FeaturedButtons>
            <WatchButton href={`/watch/${item.id}`}>&#9658; assistir </WatchButton>
            <AddToListButton href={`/list/add/${item.id}`}>+ minha lista</AddToListButton>
          </FeaturedButtons>

          <FeaturedGenres>
            <strong>gêneros:</strong> {genresList.join(', ')}
          </FeaturedGenres>
        </FeaturedHorizontal>
      </FeaturedVertical>
    </FeaturedDiv>
  )
}

export default Featured