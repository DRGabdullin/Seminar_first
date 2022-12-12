package GeekBrains.Архитектура.Seminar_1.modelelements;

import java.util.Collection;

public class PoligonalModel {
    private Collection<Poligon> poligons;

    private Collection<Texture> textures;

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }

    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures)
    {
        this.poligons = poligons;
        this.textures = textures;
    }

    public PoligonalModel(Collection<Poligon> poligons)
    {
        this.poligons = poligons;
    }
}