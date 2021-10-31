package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetProps {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetProps =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetProps.Builder)
      .name(name.orNull)
      .build()
}
