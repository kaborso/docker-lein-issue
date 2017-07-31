FROM pandeiro/lein:latest

COPY project.clj /app
RUN lein deps
COPY . /app

ENTRYPOINT ["/bin/bash"]
