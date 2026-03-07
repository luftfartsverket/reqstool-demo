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

## Demo Scenarios

Each requirement ID is named to reflect the scenario it demonstrates:

| Requirement ID | Scenario | What it demonstrates |
|---|---|---|
| `REQ_PASS` | Fully implemented & verified | Code annotated, automated tests pass, manual verification passes |
| `REQ_MANUAL_FAIL` | Manual verification failed | Code annotated, automated tests pass, but manual verification reports a failure |
| `REQ_NOT_IMPLEMENTED` | Not implemented | Requirement defined but no `@Requirements` annotation in code |
| `REQ_FAILING_TEST` | Automated test fails | Code annotated, but the implementation has a bug causing the test to fail |
| `REQ_SKIPPED_TEST` | Test is skipped | Code annotated, but the test is `@Disabled` (e.g. pending integration) |
| `REQ_MISSING_TEST` | Test not written | Code annotated, SVC defined, but no `@SVCs` test exists for the SVC |

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
