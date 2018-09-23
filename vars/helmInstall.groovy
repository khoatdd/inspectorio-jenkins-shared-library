#!/usr/bin/env groovy

def call(String kuberConfig, String kuberContext, String config) {
  sh "helm install --wait --debug --kubeconfig ${kuberConfig} --kube-context ${kuberContext} -f ${config} helm_package"
}