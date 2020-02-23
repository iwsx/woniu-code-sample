<template>
  <div>
      <h1>message page</h1>
      <ul>
          <li v-for="item in messages" :key="item.id">
              <router-link :to="`/home/message/detail/${item.id}`">{{item.info}}</router-link>
          </li>
      </ul>
      <hr>
      <router-view></router-view>
  </div>
</template>

<script>
export default {
    data() {
      return {
          messages: []

      }
    },
    mounted(){
        setTimeout(() => {
            this.messages = [
                {id:1, info:'message1'},
                {id:2, info:'message2'},
                {id:3, info:'message3'},
            ]
        }, 1000);
    }

}
</script>

<style>

</style>