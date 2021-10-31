package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlueDataCatalogConfigurationProperty {

  def apply(
    databaseArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty.Builder)
      .databaseArn(databaseArn.orNull)
      .build()
}
