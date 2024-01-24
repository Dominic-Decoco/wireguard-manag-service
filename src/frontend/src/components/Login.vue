<script setup>
import {ref} from "vue";
import {postInApi} from "../api.js";
const valuePassword = ref(null);
const valueEmail = ref(null);

const pathURL = 'login';

function login(postValueEmail, postValuePassword) {
  const postData = {
    email: postValueEmail,
    password: postValuePassword
  };
  console.log(pathURL, postData);
  postInApi(pathURL, postData)
}

</script>

<template>
  <div
      class="w-full min-h-screen p-8 flex items-center justify-center transition-all duration-200 bg-slate-300 bg-gradient-to-r from-slate-900 via-purple-800 to-slate-900">

    <div class="bg-white/10 p-9 rounded-xl backdrop-blur-xl flex flex-col gap-6 shadow-xl">
      <div class="text-center">
                <span class="bg-white/10 inline-flex justify-center items-center rounded-full p-4">
                    <i class="pi pi-user text-4xl text-white" />
                </span>
      </div>
      <InputText v-model="valueEmail" placeholder="email" />
      <Password v-model="valuePassword" toggleMask placeholder="password" />
      <Button label="Login"
        @click="login(valueEmail, valuePassword)"
      />

    </div>
  </div>
</template>