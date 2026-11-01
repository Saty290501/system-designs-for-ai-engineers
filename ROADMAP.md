# Project Roadmap

This roadmap tracks a topic-by-topic study of Martin Kleppmann's *Designing Data-Intensive Applications*, followed by practical connections to AI engineering systems.

## Guiding principles

- Follow the book's table of contents in order.
- Explain concepts in original, concise language and draw original visuals.
- Connect a topic to AI systems only when the connection is technically useful.
- Show tradeoffs, assumptions, and failure cases, not just architecture diagrams.
- Keep fast-changing AI tools and market notes separate from book-based foundations.
- Credit the author and book; do not reproduce book passages or figures.

## Stage 0 — Project setup

- [x] Confirm the edition of DDIA used for the study: first edition, 2017
- [x] Record its three parts and 12 chapters below
- [x] Set a consistent format for each learning entry
- [x] Create the public GitHub repository, README, and roadmap

## Stage 1 — Study DDIA topic by topic

For each chapter, create an entry organized around its topic:

- [ ] Read and take personal notes
- [ ] Write a short explanation in original words
- [ ] Create an original visualization
- [ ] Add a practical system design example
- [ ] Explain the AI engineering connection, if applicable
- [ ] Record important tradeoffs, assumptions, and failure modes
- [ ] Link to the corresponding book chapter or section
- [ ] Review and publish the entry

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

## Stage 2 — Connect foundations to AI engineering

As the relevant concepts are covered, add focused connections such as:

- Data ingestion, storage, indexing, and retrieval for AI applications
- Embeddings and vector search as one retrieval option among others
- Data encoding, schema evolution, and service interfaces in model pipelines
- Replication, partitioning, and distributed processing for growing workloads
- Batch and stream processing for data and online features
- Reliability, latency, cost, and observability for model serving
- Privacy, security, evaluation, and responsible handling of data

## Stage 3 — Build connected case studies

- [ ] Document question-answering / retrieval-augmented generation system
- [ ] AI inference service with latency, cost, and reliability considerations
- [ ] AI data pipeline covering ingestion, transformation, and derived data

Each case study should link back to the DDIA concepts it applies and make its assumptions and design tradeoffs visible.

## Stage 4 — Keep current AI engineering context

- [ ] Add a separate section for evolving tools and practices, such as model serving, evaluation, observability, and governance
- [ ] Date each update and link to primary sources
- [ ] Revisit these notes periodically; keep the foundational book notes stable

## Progress tracker

| Area | Status |
|---|---|
| Project setup | Complete |
| DDIA topic entries | Not started |
| AI engineering connections | Not started |
| Case studies | Not started |
| Current AI systems context | Not started |
