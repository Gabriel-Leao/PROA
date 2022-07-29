import { createStitches } from '@stitches/react'

const { styled } = createStitches({
    media: {
      bp1: '(max-width: 760px)'
    }
})

export const ContentRow = styled('div', {
  marginBottom: '30px',
  
  '& h2': {
    marginLeft: '40px'
  },

  '& .arrowLeft, .arrowRight': {
    position: 'absolute',
    width: '40px',
    height: '369px',
    zIndex: '99',
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    overflow: 'hidden',
    cursor: 'pointer',
    opacity: '0',
    transition: 'all ease 0.5s',
  },

  '& .arrowLeft': {
    left: '0'
  },

  '& .arrowRight': {
    right: '0'
  },

  '&:hover .arrowLeft, &:hover .arrowRight': {
    opacity: '1'
  },

  '@bp1': {
    '.arrowLeft, .arrowRight': {
      opacity: '1'
    }
  }
})

export const ListArea = styled('div', {
  paddingLeft: '30px',
  overflowX: 'hidden'
})

export const List = styled('div', {
  transition: 'all ease .5s'
})

export const ListItem = styled('div', {
  cursor: 'pointer',
  display: 'inline-block',
  height: '369px',
  width: '246px',

  '& img': {
    height: '100%',
    transform: 'scale(0.9)',
    transition: 'all ease 0.2s',
    width: '100%',

    '&:hover': {
      transform: 'scale(1)'
    }
  }
})