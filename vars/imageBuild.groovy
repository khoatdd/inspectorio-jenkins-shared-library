#!/usr/bin/env groovy

def call(String containerName, String tag) {
  sh "${DOCKER}/docker build -t $containerName:$tag  -t $containerName --pull --no-cache docker_package"
  echo "Image build complete"
}