<template>
  <div>
    <h1>{{$route.params.id}}</h1>
    <ul>
        <li>{{message.id}}</li>
        <li>{{message.title}}</li>
        <li>{{message.content}}</li>
    </ul>
  </div>
  
</template>

<script>
const allMessages = [
                {id:1, title:'message1', content:'message1 info...'},
                {id:2, title:'message2', content:'message2 info...'},
                {id:3, title:'message3', content:'message3 info...'},
            ];

export default {
    
    computed : {
        message(){
            return allMessages.find(message => message.id == this.$route.params.id)
        }
    }
}
</script>

<style>

</style>