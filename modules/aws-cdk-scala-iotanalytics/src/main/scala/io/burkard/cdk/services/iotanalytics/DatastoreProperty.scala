package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatastoreProperty {

  def apply(
    name: Option[String] = None,
    datastoreName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder)
      .name(name.orNull)
      .datastoreName(datastoreName.orNull)
      .build()
}
