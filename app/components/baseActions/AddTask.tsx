'use client'
import { useState } from 'react'
import { AiOutlinePlus   } from 'react-icons/ai'

const AddTask = () => {
  const [value, setValue] = useState('')
  return (
    <div>
      
        <button className='btn btn-primary'>Add a task<AiOutlinePlus className='ml-2' size={18}/>
        </button>
    </div>
  )
}
 
export default AddTask