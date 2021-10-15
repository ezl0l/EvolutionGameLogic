public class Card {
    private final Property mainProperty;
    private final Property additionalProperty;
    private boolean isUseAdditionalProperty;

    public Card(Property mainProperty, Property additionalProperty){
        this.mainProperty = mainProperty;
        this.additionalProperty = additionalProperty;
    }

    public Property getAdditionalProperty() {
        return additionalProperty;
    }

    public void setUseAdditionalProperty(boolean useAdditionalProperty) {
        isUseAdditionalProperty = useAdditionalProperty;
    }

    public Property getMainProperty() {
        return mainProperty;
    }

    public void info(){
        if(isUseAdditionalProperty)
            additionalProperty.info();
        else
            mainProperty.info();
    }

    public Property getCurrentProperty(){
        if(isUseAdditionalProperty){
            return additionalProperty;
        }else{
            return mainProperty;
        }
    }
}
