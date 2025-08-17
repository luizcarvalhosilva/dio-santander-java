package br.com.dio.desafio.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevs().add(this);
    }

    public void advance() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo.");
        }
    }

    public double calculateTotalXp() {
        Iterator<Content> iterator = this.completedContents.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calculateXp();
            sum += next;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) &&
                Objects.equals(subscribedContents, dev.subscribedContents) &&
                Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }
}
