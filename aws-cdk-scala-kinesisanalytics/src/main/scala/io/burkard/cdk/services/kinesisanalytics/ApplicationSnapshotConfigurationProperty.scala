package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationSnapshotConfigurationProperty {

  def apply(
    snapshotsEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder)
      .snapshotsEnabled(snapshotsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
