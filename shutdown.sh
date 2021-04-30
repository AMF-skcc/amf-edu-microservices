#!/bin/bash
kill $(lsof -ti:8081)
kill $(lsof -ti:8082)
kill $(lsof -ti:8083)
