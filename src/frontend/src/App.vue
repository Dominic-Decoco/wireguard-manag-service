<script setup>

import { ref } from 'vue';
import Login from "./components/Login.vue";

const value = ref(null);

</script>

<template>
  <div class="card flex justify-center">
    <Login/>
  </div>
</template>

