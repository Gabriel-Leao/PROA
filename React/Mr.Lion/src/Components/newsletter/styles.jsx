import { styled } from '@stitches/react'

export const StyledSection = styled('section', {
  backgroundColor: '#111',
  float: 'left',
  padding: '50px 8%',
  width: '100%',

  '& h3': {
    color: '#fff',
    fontSize: '1.8em',
    textAlign: 'center'
  },

  '& p': {
    color: '#fff',
    fontSize: '1.2em',
    textAlign: 'center'
  },

  '& form': {
    float: 'left',
    marginTop: '10px',
    width: '100%'
  },

  '& form input': {
    backgroundColor: 'transparent',
    border: '1px solid #fff',
    borderRadius: '5px',
    color: '#fff',
    float: 'left',
    marginRight: '1%',
    padding: '15px 10px',
    width: '40%'
  },

  '& button': {
    backgroundColor: '#fff',
    borderRadius: '5px',
    cursor: 'pointer',
    float: 'right',
    padding: '15px 10px',
    width: '18%',

    '&:hover': {
      transform: 'scale(1.1)',
      boxShadow: '0px 4px 0px 1px black'
    }
  }
})