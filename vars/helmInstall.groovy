#!/usr/bin/env groovy

def call(String kuberConfig, String kuberContext, String config, String release) {
  echo "Installing ${release}"
  script {
        sh """
            helm upgrade --install ${release} \
                --kubeconfig ${kuberConfig} \
                --kube-context ${kuberContext} \
                -f ${config} helm_package
        """
        sh "sleep 5"
  }
}




