package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddHeaderActionProperty {

  def apply(
    headerName: Option[String] = None,
    headerValue: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty.Builder)
      .headerName(headerName.orNull)
      .headerValue(headerValue.orNull)
      .build()
}
