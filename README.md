[![Commit Activity](https://img.shields.io/github/commit-activity/m/reqstool/reqstool-demo?label=commits&style=for-the-badge)](https://github.com/reqstool/reqstool-demo/pulse)
[![GitHub Issues](https://img.shields.io/github/issues/reqstool/reqstool-demo?style=for-the-badge&logo=github)](https://github.com/reqstool/reqstool-demo/issues)
[![License](https://img.shields.io/github/license/reqstool/reqstool-demo?style=for-the-badge&logo=opensourceinitiative)](https://opensource.org/license/mit/)
[![Build](https://img.shields.io/github/actions/workflow/status/reqstool/reqstool-demo/build.yml?style=for-the-badge&logo=github)](https://github.com/reqstool/reqstool-demo/actions/workflows/build.yml)
[![Documentation](https://img.shields.io/badge/Documentation-blue?style=for-the-badge&link=docs)](https://reqstool.github.io)

# Reqstool Demo

Demo project showing how to use the [reqstool-maven-plugin](https://github.com/reqstool/reqstool-java-maven-plugin) or [reqstool-gradle-plugin](https://github.com/reqstool/reqstool-java-gradle-plugin) to create requirements traceability artifacts.

## Overview

This project demonstrates:

- Using `@Requirements` and `@SVCs` annotations in Java code
- Automatic generation of annotations from source code
- Assembly of a ZIP artifact containing requirements, test results, and traceability data
- Integration with the reqstool Python client for requirements analysis
- Support for both Maven and Gradle build systems

## Prerequisites

- Java 21+
- Maven 3.9+ or Gradle 9.3+
- Python 3.8+ (for reqstool client)

## Quick Start

### Build with Maven

```bash
mvn clean verify
```

### Build with Gradle

```bash
gradle clean build
```

### Analyze Requirements

```bash
# Install reqstool client
pipx install reqstool

# Run status report
reqstool status local -p ./docs/reqstool
```

## Documentation

Full documentation can be found [here](https://reqstool.github.io).

## Contributing

See the organization-wide [CONTRIBUTING.md](https://github.com/reqstool/.github/blob/main/CONTRIBUTING.md).

## License

MIT License.
