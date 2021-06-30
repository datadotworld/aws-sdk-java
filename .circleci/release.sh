#!/usr/bin/env bash
set -o errexit -o nounset -o pipefail

#
# Trigger a Maven release using CircleCI.
#
#  usage: ./cicd/release.sh <CIRCLECI_API_TOKEN>
#

CIRCLE_TOKEN=${1:-}

ACCOUNT=datadotworld
PROJECT=aws-sdk-java
BRANCH=main

if [[ -z "${CIRCLE_TOKEN}" ]]; then
  echo "usage: $0 <CIRCLECI_API_TOKEN>"
  exit 2
fi

curl -s -H "Content-Type: application/json" -d '{
    "build_parameters": {
        "CIRCLE_STAGE": "release_build"
    }
}' "https://circleci.com/api/v1.1/project/github/${ACCOUNT}/${PROJECT}/tree/${BRANCH}?circle-token=${CIRCLE_TOKEN}"
