import { useState } from 'react'
import { v4 as uuidv4 } from 'uuid'
import AddTask from '../AddTask'
import Tasks from '../Tasks'

const Home = () => {
  const [tasks, setTasks] = useState([
    {
      id: 1,
      title: "Estudar React",
      completed: false
    },
    {
      id: 2,
      title: "Ler livro",
      completed: true
    },
    {
      id: 3,
      title: "Assistir filme",
      completed: false
    }
  ])

  const handleTaskClick = (taskid) => {
    const newTasks = tasks.map(task => {
      if (task.id === taskid) return {...task, completed: !task.completed}

      return task
    })

    setTasks(newTasks)
  }

  const handleTaskAddition = (tasktitle) => {
    const newTasks = [
      ...tasks,
      {
        id: uuidv4(),
        title: tasktitle,
        completed: false
      }
    ]

    setTasks(newTasks)
  }

  const handleTaskDeletion = (taskid) => {
    const newTasks = tasks.filter(task => task.id != taskid)

    setTasks(newTasks)
  }

  return ( 
    <>
      <AddTask handleTaskAddition={handleTaskAddition} />
      <Tasks tasks={tasks} handleTaskClick={handleTaskClick} handleTaskDeletion={handleTaskDeletion} /> 
    </>
   )
}
 
export default Home