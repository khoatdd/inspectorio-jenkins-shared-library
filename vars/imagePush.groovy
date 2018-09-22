#!/usr/bin/env groovy

def call(String containerName, String tag, String dockerUser, String dockerPassword) {
  sh "${DOCKER}/docker login -u ${dockerUser} -p ${dockerPassword}"
  sh "${DOCKER}/docker tag ${containerName}:${tag} ${dockerUser}/${containerName}:${tag}"
  sh "${DOCKER}/docker push ${dockerUser}/${containerName}:${tag}"
  echo "Image push complete"
}