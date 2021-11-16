package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddHeaderActionConfig {

  def apply(
    headerName: String,
    headerValue: String
  ): software.amazon.awscdk.services.ses.AddHeaderActionConfig =
    (new software.amazon.awscdk.services.ses.AddHeaderActionConfig.Builder)
      .headerName(headerName)
      .headerValue(headerValue)
      .build()
}
