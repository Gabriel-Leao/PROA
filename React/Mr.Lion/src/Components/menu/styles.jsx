import { styled } from '@stitches/react'

export const StyledNav = styled('nav', {
  backgroundColor: '#111',
  float: 'left',
  padding: '18px 8%',
  width: '100%',

  '& li': {
    float: 'left'
  },

  '& li a': {
    color: 'white',
    marginRight: '25px',

    '&:hover': {
      color: '#00D1B0'
    }
  }
})

export const StyledIcons = styled('div', {
  float: 'right',

  '& a': {
    color: '#fff',
    float: 'left',
    marginLeft: '12px'
  },

  '& a>:hover': {
    color: '#00D1B0'
  }
})