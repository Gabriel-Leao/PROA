import { useState } from 'react'
import Button from '../Button'
import { ButtonContainer, Div, Input } from './styles'

const AddTask = ({ handleTaskAddition }) => {
  const [inputData, setInputData] = useState('')

  const handleInputChange = (taskTitle) => {
    setInputData(taskTitle.target.value)
  }

  const handleAddTask = () => {
    handleTaskAddition(inputData)
    setInputData('')
  }

  return ( 
    <Div>
      <Input onChange={handleInputChange} value={inputData}/> 
      <ButtonContainer>
        <Button onClick={handleAddTask}> Adicionar </Button>
      </ButtonContainer>
    </Div>
   )
}
 
export default AddTask