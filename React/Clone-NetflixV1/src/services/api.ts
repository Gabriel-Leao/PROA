const API_KEY = '8b6f220598d0da0671df2c1c6081e46c'
const API_BASE = 'https://api.themoviedb.org/3/'

/* 
- Originais Netflix
- Recomendados (trending)
- Em alta (top rated)
- Ação
- Comédia
- Terror
- Romance
- Documentários
*/

const searchContent = async (endpoint: String) => {
  const req = await fetch(`${API_BASE}${endpoint}&language=pt-BR&api_key=${API_KEY}`)
  const json = req.json()

  return json
}

export default {
  getHomeList: async () => {
    return [
      {
        slug: 'originals',
        title: 'Originais Netflix',
        items: await searchContent('discover/tv?with_networkid=213')
      },

      {
        slug: 'trending',
        title: 'Recomendados para Você',
        items: await searchContent('trending/all/week?')
      },

      {
        slug: 'top rated',
        title: 'Em Alta',
        items: await searchContent('movie/top_rated?')
      },

      {
        slug: 'action',
        title: 'Ação',
        items: await searchContent('discover/movie?with_genres=28')
      },

      {
        slug: 'comedy',
        title: 'Comédia',
        items: await searchContent('discover/movie?with_genres=35')
      },

      {
        slug: 'horror',
        title: 'Terror',
        items: await searchContent('discover/movie?with_genres=27')
      },

      {
        slug: 'romance',
        title: 'Romance',
        items: await searchContent('discover/movie?with_genres=10749')
      },

      {
        slug: 'documentary',
        title: 'Documentários',
        items: await searchContent('discover/movie?with_genres=99')
      }
    ]
  },

  getContentInfo: async (contentId: Number, type: String) => {
    let info

    if (contentId) {
      switch(type) {
        case 'movie':
          return info = await searchContent(`movie/${contentId}?`)
        case 'tv':
          return info = await searchContent(`tv/${contentId}?`)
        default:
          info = null
        break
      }
    }

    return info
  }
}