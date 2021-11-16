package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatastoreProperty {

  def apply(
    name: String,
    datastoreName: String
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder)
      .name(name)
      .datastoreName(datastoreName)
      .build()
}
