import { createApp } from "vue";
import { createPinia } from 'pinia'
import "./style.css";
import "primeicons/primeicons.css";
import App from "./App.vue";
import PrimeVue from "primevue/config";
import Lara from "./presets/lara";
import InputText from "primevue/inputtext";
import Password from "primevue/password";
import Button from "primevue/button";
import StyleClass from "primevue/styleclass";

const app = createApp(App);
const pinia = createPinia()
app.component("InputText", InputText);
app.component("Password", Password);
app.component("Button", Button);
app.directive("styleclass", StyleClass);

app.use(PrimeVue, { unstyled: true, pt: Lara});
app.use(pinia)
app.mount("#app");