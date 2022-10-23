FROM node:16.13.2
ENV NODE_ENV=production
WORKDIR /NODESERVICEFACTURE
COPY ["package.json", "package-lock.json*", "./"]
RUN npm install --production --silent && mv node_modules ../
COPY . .
EXPOSE 3000
RUN chown -R node server.js
CMD ["npm", "start"]
