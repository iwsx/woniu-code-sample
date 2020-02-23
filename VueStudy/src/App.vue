<template>
  <div>
    <top-news></top-news>
  </div>
</template>

<script>
import TopNews from '@/views/TopNews'

export default {
  components: {
    TopNews
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
