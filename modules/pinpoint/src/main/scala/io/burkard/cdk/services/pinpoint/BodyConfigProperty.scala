package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BodyConfigProperty {

  def apply(
    body: Option[String] = None,
    textColor: Option[String] = None,
    alignment: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty.Builder)
      .body(body.orNull)
      .textColor(textColor.orNull)
      .alignment(alignment.orNull)
      .build()
}
