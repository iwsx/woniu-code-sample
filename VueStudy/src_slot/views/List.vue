<template>
    <ul class="todo-main">
        <TodoItem  v-for="(item,index) in todos" :key="index" :index="index" 
          :todo="item" :decrement=decrement></TodoItem>   
    </ul>
   
</template>

<script>
import TodoItem from '@/views/Item';

export default {
    components:{
      TodoItem
    },
    props: {
      todos: Array,
      decrement: Function
    }
}
</script>

<style>

/*main*/
.todo-main {
  margin-left: 0px;
  border: 1px solid #ddd;
  border-radius: 2px;
  padding: 0px;
}

.todo-empty {
  height: 40px;
  line-height: 40px;
  border: 1px solid #ddd;
  border-radius: 2px;
  padding-left: 5px;
  margin-top: 10px;
}
</style>