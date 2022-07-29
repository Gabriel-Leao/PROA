import { createStitches } from '@stitches/react'

const { styled } = createStitches({
    media: {
      bp1: '(max-width: 760px)'
    }
})

export const FeaturedDiv = styled('div', {
  backgroundSize: 'cover',
  backgroundPosition: 'center',
  height: '100vh',

  '@bp1': {
    height: '90vh'
  }
})

export const FeaturedVertical = styled('div', {
  background: 'linear-gradient(to top, #111 10%, transparent 90%)',
  height: 'inherit',
  width: 'inherit'
})

export const FeaturedHorizontal = styled('div', {
  background: 'linear-gradient(to right, #111 30%, transparent 70%)',
  display: 'flex',
  flexDirection: 'column',
  height: 'inherit',
  justifyContent: 'center',
  paddingBottom: '150px',
  paddingLeft: '30px',
  paddingTop: '70px',
  width: 'inherit'
})

export const FeaturedName = styled('div', {
  fontSize: '60px',
  fontWeight: 'bold',
  maxWidth: '40%',

  '@bp1': {
    fontSize: '40px'
  }
})

export const FeaturedInfo = styled('div', {
  fontSize: '18px',
  fontWeight: 'bold',
  marginTop: '15px',

  '@bp1': {
    fontSize: '16px'
  }
})

export const FeaturedPoints = styled('div', {
  color: '#46d369',
  display: 'inline-block',
  marginRight: '15px'
})

export const FeaturedYear = styled('div', {
  display: 'inline-block',
  marginRight: '15px'
})

export const FeaturedSeasons = styled('div', {
  display: 'inline-block',
  marginRight: '15px'
})

export const FeaturedDescription = styled('div', {
  marginTop: '15px',
  fontSize: '20px',
  color: '#999',
  maxWidth: '40%',

  '@bp1': {
    fontSize: '14px',
    maxWidth: '100%',
    marginRight: '20px'
  }
})

export const FeaturedButtons = styled('div', {
  marginTop: '15px',
  textTransform: 'capitalize'
})

export const FeaturedGenres = styled('div', {
  marginTop: '15px',
  fontSize: '18px',
  color: '#999',

  '& strong': {
    textTransform: 'capitalize'
  },

  '@bp1': {
    fontSize: '14px',
    marginRight: '30px'
  }
})