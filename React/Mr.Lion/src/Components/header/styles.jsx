import { styled } from '@stitches/react'

export const StyledHeader = styled('header', {
  backgroundColor: '#13c7ae',
  float: 'left',
  padding: '50px 8%',
  width: '100%',

  '& a': {
    color: '#fff',
    float: 'left',
    fontSize: '40px',
    height: '48px'
  },

  '& img': {
    color: '#fff',
    float: 'left',
    width: '50px',
    height: '45px',
  },

  '& form': {
    float: 'right',
    width: '30%'
  },

  '& input': {
    borderRadius: '10px 0 0 10px',
    float: 'left',
    padding: '15px 10px',
    width: '85%'
  },

  '& button': {
    backgroundColor: '#0cae98',
    borderRadius: '0 10px 10px 0',
    color: '#fff',
    cursor: 'pointer',
    float: 'right',
    padding: '15px 10px',
    transition: '.15s opacity ease',
    width: '15%',

    '&:hover': {
      opacity: '.75',
      transform: 'scale(1.2)'
    }
  }
})