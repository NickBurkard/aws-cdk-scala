package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SAPODataSourcePropertiesProperty {

  def apply(
    objectPath: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty.Builder)
      .objectPath(objectPath.orNull)
      .build()
}
