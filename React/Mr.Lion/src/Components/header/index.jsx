import { StyledHeader } from './styles'
import { SearchOutlined } from '@ant-design/icons'

const Header = () => {
  return ( 
    <StyledHeader>
      <h1>
        <img src='/logo.png' alt='' />
        <a href='#' title='Reparando computadores com um sorriso'>Mr. Lion</a>
      </h1>

      <form>
        <input type='text' placeholder='Digite a sua pesquisa...'/>
        <button><SearchOutlined /></button>
      </form>
    </StyledHeader>
   )
}
 
export default Header