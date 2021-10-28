package io.burkard.cdk.services.healthlake

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PreloadDataConfigProperty {

  def apply(
    preloadDataType: Option[String] = None
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty.Builder)
      .preloadDataType(preloadDataType.orNull)
      .build()
}
