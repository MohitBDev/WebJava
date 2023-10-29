package com.app.pojos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



//id | name    | party    | votes

@Entity
@ Table(name="candidate")
public class Candidate extends BaseEntity {
	@Column(name="name",length = 30)
	private String name;
	@Column(name="party",length = 50)
	private String party;
	@Column(name="votes")
	private int votes;
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name ="users",
     joinColumns = @JoinColumn(name="cand_id"),
	inverseJoinColumns = @JoinColumn(name="user_id"))
	private Set<Candidate> candiSet = new HashSet<>();

	public Candidate() {
		
	}

	public Candidate( String name, String party, int votes) {
		super();
		
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + getId()+ ", name=" + name + ", party=" + party + ", votes=" + votes
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(candiSet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(candiSet, other.candiSet);
	}
	

}
