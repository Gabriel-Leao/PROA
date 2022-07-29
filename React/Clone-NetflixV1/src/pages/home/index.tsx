import { useEffect, useState } from "react"
import ListRow from "../../components/contentList"
import Featured from "../../components/featuredContent"
import api from "../../services/api"
import { IContent } from "../../interfaces"
import { ListsSection, StyledHome } from "./styles"
import Header from "../../components/header"

const Home = () => {
  const [contentList, setContentList] = useState<Array<IContent>>([])
  const [featuredData, setFeaturedData] = useState(null)
  const [blackHeader, setBlackHeader] = useState(false)

  useEffect(() => {
    // Carregando os dados da api e guardando em list
    const loadAll = async () => {
      const list = await api.getHomeList()
      setContentList(list)

      // Carregando informações do destaque
      const orignals = list.filter(i => i.slug === 'originals')
      const randomNumber = Math.floor(Math.random() * (orignals[0].items.results.length -1))
      const chosenOne = orignals[0].items.results[randomNumber]
      const chosenInfo = await api.getContentInfo(chosenOne.id, 'tv')
      setFeaturedData(chosenInfo)
    }

    loadAll()
  }, [])

  useEffect(() => {
    const scrollListener = () => {
      if(window.scrollY > 10) setBlackHeader(true)
      else setBlackHeader(false)
    }

    window.addEventListener('scroll', scrollListener)
    return () => {
      window.removeEventListener('scroll', scrollListener)
    }
  }, [])

  return (
    <StyledHome>
      <Header black={blackHeader} />

      {featuredData &&
        <Featured item={featuredData}/>
      }
      <ListsSection>
        {contentList.map((item, key) => (
          <ListRow title={item.title} items={item.items} key={key}/>
        ))}
      </ListsSection>

      <footer>
        Feito com <span role="img" aria-label="coração">❤️</span> por <a href="https://linkedin.com/in/leao-gabriel" target="_blank">Gabriel Leão</a> <br />
        Direitos de imagem para Netflix <br/>
        Dados pegos pelo site Themoviedb.org
      </footer>

      {contentList.length <= 0 &&
        <div className="loading">
          <img src="Netflix_LoadTime.gif" alt="Loading netflix" />
        </div>
      }
    </StyledHome>
  )
}

export default Home