package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationSetProps {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetProps =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetProps.Builder)
      .name(name.orNull)
      .build()
}
