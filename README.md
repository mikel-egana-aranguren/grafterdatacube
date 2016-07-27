# Grafter Data cube experiments

## Usage

### Leiningen

`lein grafter run grafterdatacube.core/convert-ataun-to-data ./data/ataun-2014-2015.csv ./output/output-ataun-2014-2015.csv`

`lein grafter run grafterdatacube.core/convert-ataun-data-to-graph ./data/ataun-2014-2015.csv ./output/ataun-2014-2015.ttl`

### REPL

`=> (grafterdatacube.core/convert-persons-data-to-graph "./data/ataun-2014-2015.csv")`

`=> (grafterdatacube.core/convert-ataun-to-data "./data/ataun-2014-2015.csv")`

### Run as tests

Add pipeline to `test/grafterdatacube/test.clj`

## TODO

add Data Cube constraints (https://www.w3.org/TR/vocab-data-cube/#wf-rules) as Clojure tests.

## Tests results
[![Build Status](https://travis-ci.org/mikel-egana-aranguren/grafterdatacube.svg?branch=master)](https://travis-ci.org/mikel-egana-aranguren/grafterdatacube)
