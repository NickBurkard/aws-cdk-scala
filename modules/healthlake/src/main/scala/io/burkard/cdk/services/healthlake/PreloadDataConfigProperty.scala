package io.burkard.cdk.services.healthlake

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PreloadDataConfigProperty {

  def apply(
    preloadDataType: String
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty.Builder)
      .preloadDataType(preloadDataType)
      .build()
}
