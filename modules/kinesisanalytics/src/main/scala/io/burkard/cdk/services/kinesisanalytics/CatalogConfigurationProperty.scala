package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CatalogConfigurationProperty {

  def apply(
    glueDataCatalogConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty.Builder)
      .glueDataCatalogConfiguration(glueDataCatalogConfiguration.orNull)
      .build()
}
