#!/usr/bin/env bash

curl -s "https://get.sdkman.io" | bash
source ~/.bash_profile

sdk install kotlin                      # install Kotlin
sdk install maven                       # install Maven
sdk install kscript                     # install KScript

echo ""
echo "======================================================================================================"
echo ""
echo "Installing koops on top of SDKMAN and kscript..."
echo ""
echo "======================================================================================================"

KOOPS_DIR=${SDKMAN_DIR}/candidates/koops
KOOPS_VERSION=1.0.0

mkdir -p ${KOOPS_DIR}
mkdir -p ${KOOPS_DIR}/${KOOPS_VERSION}
mkdir -p ${KOOPS_DIR}/${KOOPS_VERSION}/bin

ln -sf ${SDKMAN_DIR}/candidates/koops/1.0.0 ${SDKMAN_DIR}/candidates/koops/current

cat > ${SDKMAN_DIR}/candidates/koops/1.0.0/bin/koops << EOF
#!/usr/bin/env bash

export CUSTOM_KSCRIPT_NAME='koops'

export CUSTOM_KSCRIPT_PREAMBLE='
@file:DependsOn("com.codingue.koops:koops-core:1.0-SNAPSHOT")
@file:DependsOn("com.codingue.koops:koops-maven:1.0-SNAPSHOT")
@file:DependsOn("com.codingue.koops:koops-aws:1.0-SNAPSHOT")
'
exec kscript \$@
EOF

chmod a+x ${SDKMAN_DIR}/candidates/koops/1.0.0/bin/koops

if ! grep -q "koops" ${SDKMAN_DIR}/var/candidates; then
    echo ",koops" >> ${SDKMAN_DIR}/var/candidates
fi

