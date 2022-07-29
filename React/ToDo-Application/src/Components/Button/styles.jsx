import { styled } from '@stitches/react'

const StyledButton = styled('button', {
  backgroundColor: 'Chartreuse',
  border: 'none',
  borderRadius: '5px',
  color: '#000',
  cursor: 'pointer',
  fontSize: '16px',
  fontWeight: 'bold',
  height: '40px',
  padding: '0 10px',
  transition: 'all 0.5s ease',
  width: '100%',

  '&:hover': {
    backgroundColor: '#444',
    color: 'Chartreuse'
  }
})

export default StyledButton