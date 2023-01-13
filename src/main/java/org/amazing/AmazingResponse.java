package org.amazing;

public class AmazingResponse
{
    private boolean isPersonAmazing;
    public AmazingResponse (){}
    public AmazingResponse( boolean isPersonAmazing )
    {
        this.isPersonAmazing = isPersonAmazing;
    }

    public boolean isPersonAmazing(){
        return this.isPersonAmazing;
    }

    public void setPersonAmazing( boolean personAmazing )
    {
        isPersonAmazing = personAmazing;
    }

    @Override
    public String toString()
    {
        return "{Amazing: "+this.isPersonAmazing+"}";
    }
}
