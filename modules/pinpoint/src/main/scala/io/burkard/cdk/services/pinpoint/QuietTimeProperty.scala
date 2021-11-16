package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QuietTimeProperty {

  def apply(
    end: String,
    start: String
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty.Builder)
      .end(end)
      .start(start)
      .build()
}
