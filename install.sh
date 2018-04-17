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

KSCRIPT_DIR=${SDKMAN_DIR}/candidates/kscript
KSCRIPT_CURRENT_DIR=${KSCRIPT_DIR}/current

cat > ${KSCRIPT_CURRENT_DIR}/bin/koops << EOF
#!/usr/bin/env bash

export CUSTOM_KSCRIPT_NAME='koops'

export CUSTOM_KSCRIPT_PREAMBLE='
@file:DependsOn("com.codingue.koops:koops-core:${KOOPS_VERSION}")
@file:DependsOn("com.codingue.koops:koops-maven:${KOOPS_VERSION}")
@file:DependsOn("com.codingue.koops:koops-aws:${KOOPS_VERSION}")
'
exec kscript \$@
EOF

chmod a+x ${KSCRIPT_CURRENT_DIR}/bin/koops

echo "Installation of sdkman, kotlin, maven, kscript and koops done"
