import { IContent, ItemInfo } from "../../interfaces"
import { ContentRow, List, ListArea, ListItem } from './styles'
import NavigateBeforeIcon from '@mui/icons-material/NavigateBefore'
import NavigateNextIcon from '@mui/icons-material/NavigateNext'
import { useState } from "react"

const ListRow = ({ title, items }: IContent) => {
  const [scrollX, setScrollX] = useState(0)

  const listWidth = items.results.length * 246

  const handleLeftArrow = () => {
    let x = scrollX + Math.round(window.innerWidth / 2)
    if (x > 0) x = 0
    setScrollX(x)
  }
  const handleRightArrow = () => {
    let x = scrollX - Math.round(window.innerWidth / 2)
    if (window.innerWidth - listWidth > x) x = (window.innerWidth - listWidth) - 60
    setScrollX(x)
  }

  return (
    <ContentRow>
      <h2>{ title }</h2>

      <div className="arrowLeft" onClick={handleLeftArrow}>
        <NavigateBeforeIcon style={{
          fontSize: 50,
          backgroundColor: 'rgba(0, 0, 0, .6)'
        }}/>
      </div>
      <div className="arrowRight" onClick={handleRightArrow}>
        <NavigateNextIcon style={{
          fontSize: 50,
          backgroundColor: 'rgba(0, 0, 0, .6)'
        }}/>
      </div>

      <ListArea>
        <List style={{
          marginLeft: scrollX,
          width: listWidth
          }}>
          {items.results.length >= 0 && items.results.map((item: ItemInfo, key: number) => (
            <ListItem key={key}>
              <img src={`https://image.tmdb.org/t/p/w300${item.poster_path}`}  alt={item.title}/>
            </ListItem>
          ))}
        </List>
      </ListArea>
    </ContentRow>
  )
}

export default ListRow