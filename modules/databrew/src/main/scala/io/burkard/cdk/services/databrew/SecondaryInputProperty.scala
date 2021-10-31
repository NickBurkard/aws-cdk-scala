package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecondaryInputProperty {

  def apply(
    dataCatalogInputDefinition: Option[software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty] = None,
    s3InputDefinition: Option[software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty.Builder)
      .dataCatalogInputDefinition(dataCatalogInputDefinition.orNull)
      .s3InputDefinition(s3InputDefinition.orNull)
      .build()
}
