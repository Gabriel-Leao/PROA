import { styled } from '@stitches/react'

export const StyledHome = styled('div', {
  '& footer': {
    margin: '50px 0',
    textAlign: 'center',

    '& a': {
      color: '#fff'
    },
  },

  '& .loading': {
    position: 'fixed',
    top: '0',
    left: '0',
    right: '0',
    bottom: '0',
    zIndex: '99',
    backgroundColor: '#000',
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
  }
})

export const ListsSection = styled('section', {
  marginTop: '-150px'
})