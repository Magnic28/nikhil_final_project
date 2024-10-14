FROM node:22-bullseye as stage1
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

FROM nginx:bullseye
COPY --from=stage1 /app/nginx.conf /etc/nginx
COPY --from=stage1 /app/dist/fsdfinal-frontend/browser/ /usr/share/nginx/html
EXPOSE 80
CMD [ "nginx" ,"-g", "daemon off;" ]