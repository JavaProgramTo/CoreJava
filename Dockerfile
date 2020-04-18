FROM airhacks/glassfish
COPY ./target/corejav.war ${DEPLOYMENT_DIR}
