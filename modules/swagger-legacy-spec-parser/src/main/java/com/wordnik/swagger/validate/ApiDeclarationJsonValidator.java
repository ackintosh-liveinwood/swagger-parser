package com.wordnik.swagger.validate;

public final class ApiDeclarationJsonValidator
    extends SwaggerJsonValidator
{
    public ApiDeclarationJsonValidator()
    {
        super(new ApiDeclarationSchemaValidator());
    }
}
