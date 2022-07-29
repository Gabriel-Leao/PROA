import { styled } from '@stitches/react'

export const StyledMain = styled('main', {
  float: 'left',
  padding: '20px 8%',
  width: '100%'
})

export const StyledArticle = styled('article', {
  float: 'left',
  padding: '0 20px 20px 0',
  width: '70%',

  '& h2': {
    marginBottom: '15px'
  },

  '& img': {
    borderRadius: '5px',
    float: 'left',
    margin: '0 15px 15px 0',
    width: '50%',
  },

  '& p': {
    textAlign: 'justify'
  }
})

export const StyledAside = styled('aside', {
  backgroundColor: '#f5f5f5',
  borderRadius: '5px',
  float: 'right',
  padding: '10px 20px',
  width: '30%',

  '& h2': {
    marginBottom: '5px'
  },

  '& iframe': {
    height: '250px',
    margin: '20px 0',
    width: '100%'
  },

  '& li': {
    color: ' #777',
    marginBottom: '10px'
  },

  '& i': {
    marginRight: '5px'
  }
})