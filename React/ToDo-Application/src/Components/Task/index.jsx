import { DeleteButton, InfoButton, StyledTask, TaskTitle } from './styles'
import { CloseOutlined, InfoCircleOutlined } from '@ant-design/icons'
import { useNavigate } from 'react-router-dom'

const Task = ({ task, handleTaskClick, handleTaskDeletion }) => {
  let navigate = useNavigate()

  const handleTaskDetailsClick = () => {
    navigate(`/${task.title}`)
  }
  

  return (
    <StyledTask style={ task.completed ? {borderLeft: '6px solid chartreuse'}: {} } >
      <TaskTitle onClick={ () => handleTaskClick(task.id) } > { task.title } </TaskTitle>

      <InfoButton onClick={handleTaskDetailsClick}> <InfoCircleOutlined /> </InfoButton>
      <DeleteButton onClick={() => handleTaskDeletion(task.id)} > <CloseOutlined /> </DeleteButton>
    </StyledTask> 
  )
}
 
export default Task