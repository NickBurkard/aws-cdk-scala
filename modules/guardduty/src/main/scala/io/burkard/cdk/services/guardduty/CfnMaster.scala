package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaster {

  def apply(
    internalResourceId: String,
    detectorId: Option[String] = None,
    masterId: Option[String] = None,
    invitationId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnMaster =
    software.amazon.awscdk.services.guardduty.CfnMaster.Builder
      .create(stackCtx, internalResourceId)
      .detectorId(detectorId.orNull)
      .masterId(masterId.orNull)
      .invitationId(invitationId.orNull)
      .build()
}
