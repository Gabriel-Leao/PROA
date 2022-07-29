import { useNavigate, useParams } from 'react-router-dom'
import Button from '../Button'
import { ButtonDiv, DetailsContainer, H2 } from './styles'

const TaskDetails = () => {
  const params = useParams()
  let navigate = useNavigate()

  const handleBackButtonClick = () => {
    navigate("/")
  }

  return ( 
    <>
      <ButtonDiv>
        <Button onClick={handleBackButtonClick}>Voltar</Button>
      </ButtonDiv>

      <DetailsContainer>
        <H2>{params.tasktitle}</H2>

        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis nisi est nemo ullam, sapiente vitae! Ullam rerum hic, pariatur illum rem consectetur iste, impedit excepturi porro adipisci, voluptates mollitia sunt.</p>
      </DetailsContainer>
    </>
   )
}
 
export default TaskDetails