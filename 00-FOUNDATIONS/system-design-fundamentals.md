# System Design Fundamentals

System design is the work of turning a problem and its constraints into a system that can meet its needs. The design is a reasoned set of choices: what the system must do, how well it must do it, where data lives, how components communicate, and how the design changes when load or failure grows.

## A practical sequence

```mermaid
flowchart LR
  P[Problem] --> R[Requirements]
  R --> E[Estimates]
  E --> A[APIs and data]
  A --> D[Architecture]
  D --> B[Bottlenecks and failures]
  B --> T[Tradeoffs and validation]
```

1. **Clarify the problem.** Identify users, use cases, scope, and what is out of scope.
2. **Separate functional and quality requirements.** Functional requirements describe behavior. Quality requirements include latency, availability, durability, privacy, and maintainability.
3. **Estimate the workload.** Approximate request rates, data volume, read/write mix, and growth. Use estimates to guide choices, not to create false precision.
4. **Sketch the API and data model.** Identify the key requests and the data they read or change.
5. **Choose a simple architecture.** Start with the fewest components that satisfy the requirements.
6. **Follow the critical paths.** Walk through a read and a write. Ask what happens when a dependency is slow, unavailable, or returns stale data.
7. **Discuss tradeoffs and evolution.** Name the bottleneck, the signal that would reveal it, and a plausible next step.

## Design is iterative

A design is not a shopping list of technologies. Pick a technology because a requirement or measured bottleneck calls for it. A database, queue, cache, or microservice each adds operational and failure modes as well as capabilities.

## AI engineering connection

For a document question-answering service, define what a useful answer means, how current documents must be, what response time is acceptable, and how unsupported answers are handled. Then trace one request through retrieval, model inference, and response generation. Model quality, latency, cost, privacy, and graceful failure all belong in the system requirements.

## Practice

Design a service that answers questions over a team's internal documents. Write three functional requirements and three quality requirements before drawing any components.

## References

- Martin Kleppmann, *Designing Data-Intensive Applications*, Chapter 1, “Reliable, Scalable, and Maintainable Applications.”
- [Hello Interview — Introduction](https://www.hellointerview.com/learn/system-design/in-a-hurry/introduction) (used as an interview-practice lens for requirements, solution design, technical depth, and communication).
- [NeetCode — System Design Interview course](https://neetcode.io/courses/system-design-interview/0) (practice problems after the fundamentals).
