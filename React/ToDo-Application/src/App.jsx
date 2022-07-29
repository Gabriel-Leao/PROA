import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Container from './Components/Container/style'
import HeaderTitle from './Components/HeaderTitle'
import Home from './Components/Home'
import TaskDetails from './Components/TaskDetails'

const App = () => {
  return (
    <BrowserRouter>
      <Container>
        <header>
          <HeaderTitle>minhas tarefas</HeaderTitle>
        </header>
        <Routes>
          <Route path="/" element={ <Home /> } />
          <Route path="/:tasktitle" element={<TaskDetails />} />
        </Routes>
      </Container>
    </BrowserRouter>
  )
}

export default App