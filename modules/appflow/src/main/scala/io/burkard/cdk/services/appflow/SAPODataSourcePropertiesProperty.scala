package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SAPODataSourcePropertiesProperty {

  def apply(
    objectPath: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty.Builder)
      .objectPath(objectPath)
      .build()
}
