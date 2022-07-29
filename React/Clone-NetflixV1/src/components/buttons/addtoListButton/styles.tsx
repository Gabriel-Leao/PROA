import { createStitches } from '@stitches/react'

const { styled } = createStitches({
    media: {
      bp1: '(max-width: 760px)'
    }
})

const MyListButton = styled('a', {
  backgroundColor: '#333',
  borderRadius: '5px',
  color: '#fff',
  display: 'inline-block',
  fontSize: '20px',
  fontWeight: 'bold',
  marginRight: '10px',
  padding: '12px 25px',
  transition: 'all ease 0.2s',

  '&:hover': {
    opacity: '.7'
  },

  '@bp1': {
    fontSize: '16px'
  }
})

export default MyListButton