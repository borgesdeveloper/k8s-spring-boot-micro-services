#!/bin/sh

set -o nounset -o errexit

export CONFIG=".\\k8s-deployments\\config\\config.yaml"
export DEPLOYMENS_FOLDER=".\\k8s-deployments\\deployments"

kubectl apply -f  $DEPLOYMENS_FOLDER --kubeconfig=$CONFIG
kubectl describe ingress --kubeconfig=$CONFIG
