package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnapshotOptionsProperty {

  def apply(
    automatedSnapshotStartHour: Option[Number] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty.Builder)
      .automatedSnapshotStartHour(automatedSnapshotStartHour.orNull)
      .build()
}
