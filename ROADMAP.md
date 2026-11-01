# Project Roadmap

Build system design understanding in layers: establish the fundamentals, study DDIA in the book's order, then apply those ideas to AI systems and design exercises.

## Guiding principles

- Explain ideas in original, concise language and create original visuals.
- Use DDIA as the core reference for data systems and distributed systems foundations.
- Connect a topic to AI systems where the connection is useful; don't force an AI example onto every concept.
- State assumptions, tradeoffs, and failure modes, not just components.
- Keep fast-changing tools and market notes dated and separate from stable concepts.
- Credit sources; do not reproduce book passages or figures.

## Stage 0 — Repository setup

- [x] Create the public repository, README, and roadmap
- [x] Confirm the DDIA edition: first edition (2017)
- [x] Add the foundations section and learning tracker

## Stage 1 — System design foundations

For every note, explain the concept, draw an original diagram, connect it to an AI system where useful, and include a small practice prompt.

- [x] System design fundamentals
- [x] Client–server architecture
- [x] Monolith vs. microservices
- [x] Latency, throughput, and availability
- [x] Horizontal vs. vertical scaling
- [x] CAP theorem

## Stage 2 — Study DDIA topic by topic

Follow the book's three parts and 12 chapters. Create a topic entry with an explanation, original visualization, practical example, tradeoffs, and a relevant AI connection when appropriate.

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

## Stage 3 — Connect foundations to AI engineering

- [ ] Data ingestion, storage, indexing, and retrieval
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

Link every case study to the concepts it applies and state its assumptions and tradeoffs.

## Stage 5 — Keep current AI engineering context

- [ ] Add dated notes for evolving tools and practices, such as model serving, evaluation, observability, and governance
- [ ] Link to primary sources and revisit these notes periodically

See [LEARNING-TRACKER.md](LEARNING-TRACKER.md) for topic-level progress.
