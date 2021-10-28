package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnapshotOptionsProperty {

  def apply(
    automatedSnapshotStartHour: Option[Number] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder)
      .automatedSnapshotStartHour(automatedSnapshotStartHour.orNull)
      .build()
}
