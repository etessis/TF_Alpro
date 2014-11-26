package tf_alpro;


import java.util.NoSuchElementException;

public class ListDoubleLinked<E> {

    // Referência para o sentinela de início da lista encadeada.
    //private Node<Acidente> header;
    private Node header;
    private Node headerd;
    // Referência para o sentinela de fim da lista encadeada.
//    private Node<Acidente> trailer;
    private Node trailer;
    private Node trailerd;
    // Contador do número de elementos da lista.
    private int count;

    private class Node {

        //public T element;
        public Acidente element;
        public Node next;
        public Node prev;
        public Node nextd;
        public Node prevd;

        public Node(Acidente e) {
            element = e;
            next = null;
            prev = null;
            nextd = null;
            prevd = null;
        }
    }

    public ListDoubleLinked() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        
        headerd = new Node(null);
        trailerd = new Node(null);
        headerd.nextd = trailerd;
        trailerd.prevd = headerd;
        
        count = 0;
    }



    /**
     * Adiciona um elemento ao final da lista
     *
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Acidente a) {
        //Node<Acidente> n = new Node<>(a);
        Node n = new Node(a);
        //Node<Acidente> aux = header.next;
        Node aux = header.next;
        Node auxd = headerd.nextd;
        if (count == 0) {

            n.prev = trailer.prev;
            n.next = trailer;
            trailer.prev.next = n;
            trailer.prev = n;
            
            n.prevd = trailerd.prevd;
            n.nextd = trailerd;
            trailerd.prevd.nextd = n;
            trailerd.prevd = n;
            
            count++;
            //n.toString();
            return;
        }
        //ordena por nome
        for (int i = 0; i < this.size(); i++) {
            //if (n.element.getRuanome().compareTo(aux.element.getRuanome()) > 0) {
            if(n.element.getRuanome().compareTo(aux.element.getRuanome())>0){
                aux = aux.next;
            }else{
                break;
            }
            //n.toString();
            // break;
        }
        n.next = aux;
        n.prev = aux.prev;
        aux.prev.next = n;
        aux.prev = n;
        
        //ordena por data
        
       /**
        * Node auxData = headerData.nextData;
            while (auxData != trailerData) {
                try {
                    if (element.getData().after(auxData.element.getData())) {
                        auxData = auxData.nextData;
                    } else if (element.getData().before(auxData.element.getData())) {
                        novoNodo.nextData = auxData;
                        novoNodo.prevData = auxData.prevData;
                        auxData.prevData.nextData = novoNodo;
                        auxData.prevData = novoNodo;
                        inseriu = true;
                        break;
                    } else {
                        novoNodo.nextData = auxData;
                        novoNodo.prevData = auxData.prevData;
                        auxData.prevData.nextData = novoNodo;
                        auxData.prevData = novoNodo;
                        inseriu = true;
                        break;
                    }
                } catch (Exception exp) {
                    System.out.println("Erro list: " + exp);
                }
            }
            if (inseriu == false) {
                novoNodo.prevData = trailerData.prevData;
                novoNodo.nextData = trailerData;
                trailerData.prevData.nextData = novoNodo;
                trailerData.prevData = novoNodo;
            } 
        * 
        * 
        */
         for (int i = 0; i < this.size(); i++) {
            if(n.element.getDataHora().after(aux.element.getDataHora())){
                aux = aux.next;
            }else{
                //insere no fim
                break;
            }
            //n.toString();
            // break;
        }
        n.nextd = auxd;
        n.prevd = auxd.prevd;
        auxd.prevd.nextd = n;
        auxd.prevd = n;

        count++;
    }

    /**
     * Insere um elemento em uma determinada posição da lista
     *
     * @param index a posição da lista onde o elemento será inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Acidente element) throws IndexOutOfBoundsException {

        //Node<Acidente> aux = header.next;
        Node aux = header.next;
        //Node<Acidente> aux2 = new Node<>(element);
        Node aux2 = new Node(element);

        if (index == count) {
            aux2.next = trailer;
            aux2.prev = trailer.prev;
            trailer.prev.next = aux2;
            trailer.prev = aux2;

            count++;
            return;
        }

        if (index > count / 2) {
            for (int i = count - 1; i < index; i--) {
                aux = aux.prev;
            }
        } else {
            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }
        }

        aux2.next = aux;
        aux2.prev = aux.prev;
        aux.prev = aux2;
        aux.prev.next = aux2;
        count++;

    }

    /**
     * Remove a primeira ocorrência do elemento na lista, se estiver presente
     *
     * @param element o elemento a ser removido
     * @return true se a lista contém o elemento especificado
     */
    public boolean remove(Acidente element) {

        //Node<Acidente> aux = header.next;
        Node aux = header.next;

        for (int i = 0; i < count - 1; i++) {

            if (aux.element.equals(element)) {
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;

                count--;
                return true;
            }

            aux = header.next;
        }

        return false;

    }

    /**
     * Remove o elemento de uma determinada posição da lista
     *
     * @param index a posição da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Acidente remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        //Node <Acidente> aux = header.next;
        Node aux = header.next;

        if (index > count / 2) {
            for (int i = count; i > index; i--) {
                aux = aux.prev;
            }
        } else {
            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }
        }

        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;

        count--;
        return aux.element;

    }

    /**
     * Retorna o elemento de uma determinada posição da lista
     *
     * @param index a posição da lista
     * @return o elemento da posição especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Acidente get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        //Node<Acidente> aux = null;
        Node aux = null;

        if (index < count / 2) { // percorre do inicio para o fim
            aux = header.next;
            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }
        } else { // percorre do fim para o inicio
            aux = trailer.prev;
            for (int i = count - 1; i > index; i--) {
                aux = aux.prev;
            }
        }

        return aux.element;
    }

    /**
     * Retorna true se a lista contém o elemento especificado
     *
     * @param element o elemento a ser testado
     * @return true se a lista contém o elemento especificado
     */
    public boolean contains(Acidente element) {
        //Node<Acidente> aux = header.next;
        Node aux = header.next;
        while (aux != trailer) {
            if (aux.element.equals(element)) {
                return (true);
            }
            aux = aux.next;
        }
        return false;
    }

    /**
     * Retorna o índice da primeira ocorrência do elemento na lista, ou -1 se a
     * lista não contém o elemento
     *
     * @param element o elemento a ser buscado
     * @return o índice da primeira ocorrência do elemento na lista, ou -1 se a
     * lista não contém o elemento
     */
    public int indexOf(Acidente element) {
        //Node<Acidente> aux = header.next;
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            if (aux.element.equals(element)) {
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }

    /**
     * Substitui o elemento armanzenado em uma determinada posição da lista pelo
     * elemento indicado
     *
     * @param index a posição da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posição da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Acidente set(int index, Acidente element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        //Node<Acidente> aux = null;
        Node aux = null;

        if (index < count / 2) { // percorre do inicio para o fim
            aux = header.next;
            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }
        } else { // percorre do fim para o inicio
            aux = trailer.prev;
            for (int i = count - 1; i > index; i--) {
                aux = aux.prev;
            }
        }
        Acidente elemAux = aux.element;
        aux.element = element;
        return elemAux;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    /**
     * Retorna o número de elementos da lista
     *
     * @return o número de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Retorna true se a lista não contêm elementos
     *
     * @return true se a lista não contêm elementos
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        //Node<Acidente> aux = header.next;
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }
}
