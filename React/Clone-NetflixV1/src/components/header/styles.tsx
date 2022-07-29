import { styled } from '@stitches/react'

export const StyledHeader = styled('header', {
  position: 'fixed',
  zIndex: '999',
  top: '0',
  right: '0',
  left: '0',
  height: '70px',
  display: 'flex',
  justifyContent: 'space-between',
  alignItems: 'center',
  padding: '0 30px',
  background: 'transparent',
  transition: 'all ease .4s',

  '&.black': {
    backgroundColor:'#141414'
  }
})

export const StyledLogo = styled('div', {
  height: '30px',

  '& img': {
    height: '100%'
  }
})

export const StyledUser = styled('div', {
  height: '35px',

  '& img': {
    height: '100%',
    borderRadius: '3px'
  }
})