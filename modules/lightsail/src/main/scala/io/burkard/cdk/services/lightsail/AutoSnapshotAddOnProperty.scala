package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutoSnapshotAddOnProperty {

  def apply(
    snapshotTimeOfDay: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty.Builder)
      .snapshotTimeOfDay(snapshotTimeOfDay.orNull)
      .build()
}