<template>
  <div class="todo-container">
        <div class="todo-wrap">     
          <todo-header ref="header"></todo-header> 
          <!-- <todo-header @increment=increment></todo-header>    -->
          <!-- <todo-header :increment=increment></todo-header> -->
          <TodoList :todos=todos :decrement=decrement></TodoList>
          <TodoFooter :todos=todos :checkAll=checkAll :clearCompleted=clearCompleted></TodoFooter>
        </div>
  </div>
</template>

<script>
import TodoHeader from '@/views/Header'
import TodoList from '@/views/List'
import TodoFooter from '@/views/Footer'
import storageUtil from './utils/storageUtil.js'
import PubSub from 'pubsub-js'

export default {
  components:{
    TodoHeader,
    TodoList,
    TodoFooter
  },
  data() {
    return {
      //共享数据定义在根组件
      //从localStorage中获取，因为存入localStorage中的是String类型，这里需要转换一下
      //todos: JSON.parse(window.localStorage.getItem('todo_key') || '[]') 
      todos: storageUtil.getTodo()
    }
  },
  mounted() {
    this.$refs.header.$on('increment', this.increment);
    //订阅消息
    PubSub.subscribe('checkAll', (msg, isCheckAll) => {
      this.checkAll(isCheckAll);
    });
  },
  methods : {
    //数据在哪里，操作函数就放在哪里
    // 添加数据
    increment(todo){
      //todos的元素有两个属性check 代表是否选中， info 代表内容
      this.todos.unshift(todo)
    },
    // 删除数据
    decrement(index){
      //console.log(index);      
      this.todos.splice(index, 1)
    },
    // 全选
    checkAll(isCheckAll){
      this.todos.forEach(todo => {
          todo.check = isCheckAll
        })
    },
    // 清除已完成任务
    clearCompleted(){
      this.todos = this.todos.filter(todo => !todo.check)
    }
  },
  watch: {
    todos : {
      deep: true,
      handler : function(){
        //window.localStorage.setItem('todo_key', JSON.stringify(this.todos))
        storageUtil.setTodo(this.todos)
      }
    }
  }
 
}
</script>

<style>

/*app*/
.todo-container {
  width: 600px;
  margin: 0 auto;
}
.todo-container .todo-wrap {
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 5px;
}
</style>
