# Project Roadmap

Build system design understanding in layers: learn the foundations, study *Designing Data-Intensive Applications* (DDIA) topic by topic, then apply those ideas to AI systems and design exercises. The DDIA sequence follows the contents of the copy used for this project.

## Working principles

- Explain ideas in original, concise language; make the notes easier to learn from without copying the source.
- Draw original diagrams and use practical examples.
- Use DDIA as the core reference for data systems and distributed systems foundations.
- Add an AI engineering connection where it helps; don't force one onto every topic.
- State assumptions, tradeoffs, and failure modes, not just components.
- Keep fast-changing tools and market notes dated and separate from stable concepts.
- Credit sources; do not reproduce book passages or figures.

## Stage 0 — Repository setup

- [x] Create the public repository, README, and roadmap
- [x] Add the foundations section and learning tracker
- [x] Add source references and original diagrams

## Stage 1 — System design foundations

The notes establish the vocabulary and reasoning process used in later designs.

- [x] System design fundamentals
- [x] Client–server architecture
- [x] Monolith vs. microservices
- [x] Latency, throughput, and availability
- [x] Horizontal vs. vertical scaling
- [x] CAP theorem

## Stage 2 — Study DDIA topic by topic

For every chapter, write an original explanation, create a visualization, give a practical example, capture tradeoffs, and add an AI connection when relevant.

### Part I — Foundations of Data Systems

- [ ] 01 — Reliable, Scalable, and Maintainable Applications
- [ ] 02 — Data Models and Query Languages
- [ ] 03 — Storage and Retrieval
- [ ] 04 — Encoding and Evolution

### Part II — Distributed Data

- [ ] 05 — Replication
- [ ] 06 — Partitioning
- [ ] 07 — Transactions
- [ ] 08 — The Trouble with Distributed Systems
- [ ] 09 — Consistency and Consensus

### Part III — Derived Data

- [ ] 10 — Batch Processing
- [ ] 11 — Stream Processing
- [ ] 12 — The Future of Data Systems

## Stage 3 — Connect the foundations to AI engineering

Build these connections alongside the book notes when the concepts arise:

- [ ] Data ingestion, storage, indexing, and retrieval for AI applications
- [ ] Embeddings and vector search as retrieval options
- [ ] Data encoding, schema evolution, and service interfaces in model pipelines
- [ ] Replication, partitioning, and distributed processing for growing workloads
- [ ] Batch and stream processing for data and online features
- [ ] Reliability, latency, cost, and observability for model serving
- [ ] Privacy, security, evaluation, and responsible data handling

## Stage 4 — Build connected case studies

- [ ] Document question-answering / retrieval-augmented generation system
- [ ] AI inference service with latency, cost, and reliability considerations
- [ ] AI data pipeline covering ingestion, transformation, and derived data

Link each case study to the concepts it applies and state its assumptions and tradeoffs.

## Stage 5 — Keep current AI engineering context

- [ ] Add dated notes for evolving tools and practices, such as model serving, evaluation, observability, and governance
- [ ] Link to primary sources and revisit these notes periodically

## Next step

Start DDIA Chapter 1, “Reliable, Scalable, and Maintainable Applications.” Use the chapter to explore reliability, load, performance, scalability, operability, simplicity, and evolvability.

See [LEARNING-TRACKER.md](LEARNING-TRACKER.md) for topic-level progress.
