FROM python:alpine3.7

COPY . .

RUN pip install -r requirment.txt

EXPOSE 1003

ENTRYPOINT [ "python" ]

CMD ["index.py"]

# Docker has a default entrypoint which is /bin/sh -c but does not have a default command.
# https://stackoverflow.com/questions/21553353/what-is-the-difference-between-cmd-and-entrypoint-in-a-dockerfile