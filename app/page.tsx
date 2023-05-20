
import AddTask from "./components/baseActions/AddTask";
import ListTask from "./components/baseActions/ListTask";

export default function Home() {
  return (
    <main className="max-w-4xl mx-auto mt-4 ">
      <div className="text-center flex flex-col my-5 gap-4">
        <h1 className="text-2xl font-bold"> APP </h1>
        <AddTask />
      </div>
      <div>
        <ListTask />
      </div>
      
    </main>
  )
}
