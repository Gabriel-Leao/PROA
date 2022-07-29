import { MailOutlined, PhoneOutlined, WhatsAppOutlined } from '@ant-design/icons'
import { StyledArticle, StyledAside, StyledMain } from './styles'

const Main = () => {
  return ( 
    <StyledMain>
      <StyledArticle>
        <h2>Sobre nós</h2>
        <img src='/loja.jpg' alt='Imagem de uma loja de informática com três pessoas, sendo um dois homens e uma mulher. A mulher está vestida com uma bluza branca, o homem com uma blusa azul e o atedente de blusa branca'/>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi iste vitae, quis ex, officiis, autem cum fuga quo rerum eligendi suscipit. Est eveniet hic voluptatum nemo, maiores incidunt labore earum. Lorem ipsum dolor sit amet consectetur, adipisicing elit. Corrupti, enim officia quod ab quia voluptatum magnam laboriosam, accusamus vel numquam non architecto amet possimus expedita, beatae suscipit! Dolore, suscipit? Fugit.</p>
        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Id at dolore obcaecati sed impedit. Dolores magnam sit sint voluptas non, eius in culpa facilis blanditiis modi fugiat fugit officia iusto! Lorem ipsum dolor sit amet consectetur, adipisicing elit. Maxime, dolor similique. Aperiam assumenda incidunt atque, impedit provident dignissimos quo facere facilis soluta tempora animi optio iste quibusdam hic eius sint!</p>
      </StyledArticle>
      
      <StyledAside>
        <h2>Onde Estamos</h2>
        <p>R. Tito, 54 - Vila Romana, São Paulo - SP, 05051-000</p>
        <iframe src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3658.1263758192417!2d-46.69614017852173!3d-23.527956643821323!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94cef8775663b04f%3A0x923835e9005f8309!2sSenac%20Lapa%20Tito!5e0!3m2!1spt-BR!2sbr!4v1647265837461!5m2!1spt-BR!2sbr' style={{border: '0'}} allowFullScreen='' loading='lazy'></iframe>
        <h2>Contatos</h2>
        <ul>
          <li><i> <MailOutlined /> </i>gabriel.leao2507@gmail.com</li>
          <li><i> <PhoneOutlined /> </i>(11) 94701-3466</li>
          <li><i> <WhatsAppOutlined /> </i>(11) 94701-3466</li>
        </ul>
      </StyledAside>
    </StyledMain>
   )
}
 
export default Main