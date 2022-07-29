import Task from '../Task'

const Tasks = ({ tasks, handleTaskClick, handleTaskDeletion }) => {
  return (
    <>
      {tasks.map(task => <Task task={task} key={task.id} handleTaskClick={handleTaskClick} handleTaskDeletion={handleTaskDeletion} ></Task>)}
    </>
  )
}

export default Tasks