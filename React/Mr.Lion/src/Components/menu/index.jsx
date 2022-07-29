import { GithubOutlined, InstagramOutlined, LinkedinOutlined } from '@ant-design/icons'
import { StyledIcons, StyledNav } from './styles'

const Menu = () => {
  return (
    <StyledNav>
      <ul>
        <li><a href='#home'>home</a></li>
        <li><a href='#produtos'>produtos</a></li>
        <li><a href='#servicos'>serviços</a></li>
        <li><a href='#contato'>contato</a></li>
      </ul>

      <StyledIcons>
        <a href='https://github.com/Gabriel-Leao' target='_blank'><GithubOutlined /></a>
        <a href='https://www.linkedin.com/in/leao-gabriel' target='_blank'><LinkedinOutlined /></a>
        <a href='https://www.instagram.com/leao_magico25/' target='_blank'><InstagramOutlined /></a>
      </StyledIcons>
    </StyledNav>
   )
}
 
export default Menu