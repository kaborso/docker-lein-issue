FROM pandeiro/lein:latest

COPY . /app
WORKDIR /app
RUN lein deps

ENTRYPOINT ["/bin/bash"]
