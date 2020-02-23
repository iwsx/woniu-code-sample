<template>
    <div>
        <select  v-model="selected">
            <option v-for="(type, index) in types" :key="index" :value="type.value">{{type.text}}</option>
        </select>
        <hr>
        <ul>
            <li v-for="(topnew, index) in topnews" :key="index">
                <span>{{topnew.date}}</span><br>
                <span>{{topnew.category}}</span><br>
                <span><a :href="topnew.url" target="_blank">{{topnew.title}}</a></span><br>
                <img :src="topnew.thumbnail_pic_s">                
            </li>
            <br>
        </ul>
    </div>   
  
</template>

<script>
import axios from 'axios'

export default {
    data() {
        return {
            loading: false,
            errorMsg: '请求失败！',
            selected: 'top',
            //top(头条，默认),shehui(社会),guonei(国内),guoji(国际),
            //yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
            types:[
                {text:'头条', value:'top'},
                {text:'社会', value:'shehui'},
                {text:'国内', value:'guonei'},
                {text:'国际', value:'guoji'},
                {text:'娱乐', value:'yule'},
                {text:'体育', value:'tiyu'},
                {text:'军事', value:'junshi'},
                {text:'科技', value:'keji'},
                {text:'财经', value:'caijing'},
                {text:'时尚', value:'shishang'},
            ],
            topnews: []
        }
    },
    mounted() {
        this.update();
    },
    watch: {
        selected(){
            this.update();
        }
    },
    methods: {
        update(){
            let topnews = [];
            let url = `/api/toutiao/index?type=${this.selected}&key=4ec0e16a7d9060fad0adf33e06303082`
            axios.get(url)
            .then(response => {
                console.log(response.data.result.data);
                
                topnews = response.data.result.data.map(item => ({
                    date: item.date,
                    url: item.url,
                    title: item.title,
                    category: item.category,
                    thumbnail_pic_s: item.thumbnail_pic_s
                }))
                this.topnews = topnews;
            })
            .catch(error => {
                this.loading = false;
                this.errorMsg = '请求失败！';
                window.confirm(this.errorMsg);
            });
        }        
    }
}
</script>

<style>
li{
    border-bottom:1px skyblue solid;
    margin-bottom: 10px;
}

li img{
    width: 300px;
    height: 300px;
}
</style>