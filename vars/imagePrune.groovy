!/usr/bin/env groovy

def call(String containerName) {
  try {
      sh "${DOCKER}/docker image prune -f"
  } catch(error){}
}