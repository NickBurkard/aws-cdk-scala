package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationSnapshotConfigurationProperty {

  def apply(
    snapshotsEnabled: Boolean
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder)
      .snapshotsEnabled(snapshotsEnabled)
      .build()
}
