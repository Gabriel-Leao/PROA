import { styled } from '@stitches/react'

export const StyledTask = styled('div', {
  alignItems: 'center',
  backgroundColor: '#444',
  borderRadius: '5px',
  color: '#eee',
  cursor: 'pointer',
  display: 'flex', 
  justifyContent: 'space-between',
  margin: '8px 0',
  padding: '15px 20px'
})

export const TaskTitle = styled('div', {
  width: '400px'
})

export const DeleteButton = styled('button', {
  backgroundColor: '#444',
  border: 'none',
  color: 'Chartreuse',
  cursor: 'pointer',
  fontSize: '20px',
  margin: '0 5px'
})

export const InfoButton = DeleteButton