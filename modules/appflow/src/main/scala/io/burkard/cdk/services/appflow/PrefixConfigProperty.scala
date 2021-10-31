package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrefixConfigProperty {

  def apply(
    prefixType: Option[String] = None,
    prefixFormat: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty.Builder)
      .prefixType(prefixType.orNull)
      .prefixFormat(prefixFormat.orNull)
      .build()
}
