FROM node:latest as build
WORKDIR /usr/local/app
COPY . .
RUN npm install
CMD ["npm", "run" , "build", "--prod"]
FROM nginx
COPY --from=build /usr/local/app/dist/frontend /usr/share/nginx/html
EXPOSE 80
