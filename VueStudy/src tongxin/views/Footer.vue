<template>
  <div class="todo-footer">
    <label>
        <input type="checkbox" v-model="isCheckAll"/>
    </label>
    <span>
        <span>已完成{{completedCount}}</span> / 全部{{allCount}}
    </span>
    <button class="btn btn-danger" @click="clear">清除已完成任务</button>
    </div>
</template>

<script>
import PubSub from 'pubsub-js'

export default {
  props: {
    todos: Array,
    //checkAll: Function,
    clearCompleted: Function
  },

  computed: {
    allCount() {
      return this.todos.length;
    },
    completedCount() {
      return this.todos.filter(todo => todo.check).length
    },
    isCheckAll: {
      //get方法是给isCheckAll赋值用的
      get(){
        return this.completedCount > 0 && this.allCount === this.completedCount
      },
      //isCheckAll值改变时调用set方法
      set(value){
        PubSub.publish('checkAll', value)
        //this.checkAll(value)
      }
    }
  },

  methods: {
    clear() {
      if(window.confirm('是否要清除已完成任务')){
        this.clearCompleted();
      }      
    }
  }
}
</script>

<style>
/*footer*/
.todo-footer {
  height: 40px;
  line-height: 40px;
  padding-left: 6px;
  margin-top: 5px;
}

.todo-footer label {
  display: inline-block;
  margin-right: 20px;
  cursor: pointer;
}

.todo-footer label input {
  position: relative;
  top: -1px;
  vertical-align: middle;
  margin-right: 5px;
}

.todo-footer button {
  float: right;
  margin-top: 5px;
}

</style>