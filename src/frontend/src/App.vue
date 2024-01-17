<script setup>

import { ref } from 'vue';

const value = ref(null);

</script>

<template>
  <div class="card flex justify-center">
    <InputText type="text" placeholder="Test Text" v-model="value" />
  </div>
</template>

