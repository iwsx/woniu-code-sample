
const TODOKEY = 'todo_key'
export default {
    getTodo() {
       return JSON.parse(window.localStorage.getItem(TODOKEY) || '[]')
    },
    
    setTodo(value) {
        window.localStorage.setItem(TODOKEY, JSON.stringify(value))
    }
}