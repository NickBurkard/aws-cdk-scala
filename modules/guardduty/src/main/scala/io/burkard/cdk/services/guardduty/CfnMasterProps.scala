package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMasterProps {

  def apply(
    detectorId: String,
    masterId: String,
    invitationId: Option[String] = None
  ): software.amazon.awscdk.services.guardduty.CfnMasterProps =
    (new software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder)
      .detectorId(detectorId)
      .masterId(masterId)
      .invitationId(invitationId.orNull)
      .build()
}
